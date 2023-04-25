package experiments;

public class PublicClassWoMain {
	static {
		System.out.println("Inside static block");
		System.exit(0);
	}
}

class TestDriver {
	public static void main(String[] args) {
		System.out.println("Inside main printed....");
	}
}
