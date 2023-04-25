package experiments;

public class Sorting {

    public int test(int x) {
        return test2(x *= 6);
    }

    public int test2(int y) {
        return test3(y /= 6);
    }


    private int test3(int z) {
        return test4(z += 6);
    }

    private int test4(int a) {
        return test5(a -= 6);
    }

    private int test5(int b) {
        return b;
    }

    public static void main(String args[]) {

        Sorting s = new Sorting();
        System.out.println(s.test(6));
    }
}
