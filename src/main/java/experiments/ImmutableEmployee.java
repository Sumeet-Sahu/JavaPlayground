package experiments;

import java.util.Date;

public final class ImmutableEmployee {

	private final String pancardNumber;
	private final Date dateOfBirth;

	public ImmutableEmployee(String pancardNumber, Date dateOfBirth) {
		super();
		this.pancardNumber = pancardNumber;
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Employee [ pancardNumber=" + pancardNumber + ",dateOfBirth=" + dateOfBirth + "]";
	}

	public String getPancardNumber() {
		return this.pancardNumber;
	}

	public Date getDateOfBirth() {
		Date d = new Date();
		d= (Date) this.dateOfBirth.clone();
		return d;
//		
//		return this.dateOfBirth;
	}

	public static void main(String[] args) {
		
		ImmutableEmployee emp = new ImmutableEmployee("1234", new Date());
		System.out.println("Before" + emp);
		//mydob.setDate(25);
		System.out.println("After" + emp);
		
		System.out.println("======================================");
		
		ImmutableEmployee emp2 = new ImmutableEmployee("4567", new Date());
		System.out.println("Before" + emp2);
		emp2.dateOfBirth.setMonth(11);
		System.out.println("After" + emp2);
	}
}
