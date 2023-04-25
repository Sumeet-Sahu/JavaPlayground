package experiments;

public class ValidIdentifiers {

    int _1;

    int _a;

    int _$;

    public ValidIdentifiers(){
        int i = _$ + _1 + _a;
        System.out.println(i);
    }

//    String str = 'sumeet';

    public String toUpper(String str){
        return str.toUpperCase();
    }

    Object s = new Object();
}
