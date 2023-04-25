package inheritance;

public interface A {

	public int x = 10;
	public int a = 10;
	
	public default void display(){
		System.out.println(" Called from Interface A");
	}
}
