package inheritance;

public class Sub extends SuperTest {

    public Sub(String text) {
        i = 2;
    }

    public static void main(String args[]) {
        Sub sub = new Sub("Hello");
        System.out.println(sub.i);
    }
}


class SuperTest {
    public int i = 0;

    public SuperTest() {

    }

    public SuperTest(String text) /* Line 4 */ {
        i = 1;
    }
}
