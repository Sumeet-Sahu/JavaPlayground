package experiments;

public class StringEquality {

    public static void main(String[] args) {


    String s1 = "Sumeet";
    String s2 = "Sumeet";

    String status = s1 == s2 ? "EQUAL" : "NOT EQUAL";

    System.out.println(status);

    String s3 = new String("Sumeet");

    status = s1 == s3 ? "EQUAL" : "NOT EQUAL";
    System.out.println(status);

    String s4 = s3;
    status = s3 == s4 ? "EQUAL" : "NOT EQUAL";
    System.out.println(status);


    String s5 = new String(s3);
    status = s3 == s5 ? "EQUAL" : "NOT EQUAL";
    System.out.println(status);
    }

}
