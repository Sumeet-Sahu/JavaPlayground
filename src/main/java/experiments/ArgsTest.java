package experiments;

public class ArgsTest {

	{
		System.out.println("Value 1 = non static ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArgsTest a = new ArgsTest(); 
		
		System.out.println("Value 1 = main ");
		
		System.out.println("Value 1 =  "+args);

	} 

	static
	{
		System.out.println("Value 1 = static ");
	}
	
}
