package inheritance;

public class C extends B implements A, A2 {

	public int getX(){
		return A.x;
		//return 9;
	}
	
	public int getA(){
		return a;
	}
	
	public int getB(){
		return b;
	}

	@Override
	public void display() {
		A2.super.display();
	}
	
	public void print(String name) throws RuntimeException{
		System.out.println("Inside C without static");
		//super.print(null);
	}
	
	/*public static void print(String name) {
		System.out.println("Inside C with static");
	}*/
	
}
