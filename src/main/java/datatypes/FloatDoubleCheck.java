package datatypes;

public class FloatDoubleCheck {


    public static void main(String[] args) {
        double a = 1.31;
        float b = 1.31f;

        Double dd = 1.31;
        Float ff = 1.31f;

        if(a == b)
            System.out.println("t");
        else
            System.out.println("F");

        if(dd == a)
            System.out.println("t");
        else
            System.out.println("F");

        if(ff == b)
            System.out.println("t");
        else
            System.out.println("F");

        //b = (float) a;
        //b = a;
    }
}
