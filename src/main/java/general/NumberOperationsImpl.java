package general; /**
 *
 */


/**
 * @author Sumeet
 *
 */
public class NumberOperationsImpl implements NumberOperations {

    @Override
    public int[] getDigits(int[] numberArray) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isEven(int number) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i <= (number / 2); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    @Override
    public int[] sort(int[] unsortedArray) {
        // TODO Auto-generated method stub
        return null;
    }
}
