package cloning;

public class ClonableEmployee implements Cloneable {

	private String name;

	public ClonableEmployee() {
	}

	public ClonableEmployee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public ClonableEmployee getClone(ClonableEmployee clonableEmployee) throws CloneNotSupportedException {
		return (ClonableEmployee) clonableEmployee.clone();
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
