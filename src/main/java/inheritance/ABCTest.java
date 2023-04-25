package inheritance;

public class ABCTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        A a = new C();
        B b = new C();
        C c = new C();
        B b2 = new B();

        System.out.println(c.getA());
        System.out.println(c.getB());
        System.out.println(c.getX());

        b.print(null);

    }

}
