package inheritance;

class BB {

    public static String sing() {
        return "la";
    }


}


public class AA extends BB {

    public static void main(String[] args) {
        AA a = new AA();
        BB b = new AA();

        System.out.println(a.sing() + " " + b.sing());
    }

    public static String sing() {
        return "fa";
    }

}
