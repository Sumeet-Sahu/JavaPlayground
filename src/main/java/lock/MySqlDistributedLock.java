package lock;

import java.sql.*;
import java.util.Properties;
import java.util.concurrent.*;

/**
 * @param <T>
 */
public class MySqlDistributedLock<T> {

    ExecutorService executorService = Executors.newSingleThreadExecutor();

    private final int waitTimeoutInSeconds;
    private final int holdTimeout;
    private final String lockName;

    public MySqlDistributedLock(int waitTimeout, int holdTimeout, String lockName) {
        this.waitTimeoutInSeconds = waitTimeout;
        this.holdTimeout = holdTimeout;
        this.lockName = lockName;
    }

    /**
     * @param callable
     * @return -
     * @throws ExecutionException   -
     * @throws InterruptedException -
     * @throws TimeoutException     -
     * @throws SQLException         -
     */
    public T work(Callable<T> callable) throws ExecutionException, InterruptedException, TimeoutException, SQLException {
        Connection connection = null;
        try {
            connection = getConnection();
            boolean isLockAcquired = getLock(connection);
            if (isLockAcquired) {
                Future<T> future = null;
                try {
                    future = executorService.submit(callable);
                    if (holdTimeout == 0) {
                        return future.get();
                    } else {
                        return future.get(holdTimeout, TimeUnit.MILLISECONDS);
                    }
                } catch (TimeoutException ex) {
                    future.cancel(true);
                    throw ex;
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                    throw e;
                }
            } else {
                return null;
            }
        } catch (SQLException e) {
            // Unable to create connection
            e.printStackTrace();
            throw e;
        } finally {
            releaseLock(connection);
            assert connection != null;
            connection.close();
        }
    }

    /**
     * @param connection -
     * @throws SQLException -
     */
    private void releaseLock(Connection connection) throws SQLException {
        String selectQuery = "SELECT RELEASE_LOCK('" + lockName + "') as status";
        try (connection;
             PreparedStatement stmt = connection.prepareStatement(selectQuery);
             ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                int isLockReleased = rs.getInt("status");
                if (rs.wasNull()) {
                    System.out.println("Distributed lock on " + lockName + " was never acquired");
                } else if (isLockReleased == 1) {
                    System.out.println("Released distributed lock on : " + lockName);
                } else if (isLockReleased == 0) {
                    System.out.println("Distributed lock on " + lockName + " was not established by this thread");
                }
            }
        } catch (SQLException e) {
            System.out.println("Unable to release lock : " + lockName + " Cause : " + e.getCause());
            throw e;
        }
    }

    /**
     * @param connection -
     * @return -
     * @throws SQLException -
     */
    private boolean getLock(Connection connection) throws SQLException {
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.prepareStatement("SELECT GET_LOCK(?,?) as status");
            statement.setString(1, lockName);
            statement.setInt(2, waitTimeoutInSeconds);
            resultSet = statement.executeQuery();
            int status = resultSet.getInt("status");
            if (status == 1) {
                System.out.println("Lock acquired.");
                return true;
            } else {
                System.out.println("Couldn't acquire lock");
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        } finally {
            assert statement != null;
            statement.close();
            assert resultSet != null;
            resultSet.close();
        }
    }

    private Connection getConnection() throws SQLException {
        Connection conn;
        Properties connectionProps = new Properties();
        connectionProps.put("user", "root");
        connectionProps.put("password", "admin");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", connectionProps);
        return conn;
    }
}
