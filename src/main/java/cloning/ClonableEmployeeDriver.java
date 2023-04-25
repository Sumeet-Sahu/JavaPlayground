package cloning;

public class ClonableEmployeeDriver {

	public static void main(String[] args) {
		System.out.println("Execution started...");
		ClonableEmployee employee = new ClonableEmployee("Sumeet");
		ClonableEmployee employeeCopy = null;

		try {
			// Below statement will throw CloneNotSupportedException if ClonableEmpployee doesn't implements Cloneable interface
			employeeCopy = (ClonableEmployee) employee.getClone(employee);
			
			// Below statement will not compile if clone method is not OverRidden in ClonableEmployee class.
			employeeCopy = (ClonableEmployee) employee.clone();
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
