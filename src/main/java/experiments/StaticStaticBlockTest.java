package experiments;


class Super {
    public static String a = "Sumeet";
}

public class StaticStaticBlockTest extends Super{

    static {
        a = "Veritas";
    }

    public static void main(String[] args) {
        System.out.println("Value = "+ Super.a);
    }

    public void dummy(){
        System.out.println();
    }
}

