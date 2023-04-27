package java8;

import java.util.Optional;

public class OptionalExample {

    public static String getNameBad(boolean flag){
        if(flag) {
            return "Naruto";
        }
        return null; // bad thing to do
    }

    public static Optional<String> getNameGood(boolean flag) {
        if(flag) {
            return Optional.of("Naruto");
        }
        return Optional.empty(); // Good practice to follow
    }
    public static void main(String[] args) {
        Optional<String> name = getNameGood(true);
        //System.out.println(name.get()); // another bad thing to do with Optional, it defeats the purpose
        System.out.println(name.orElse(" unknown Name "));

        Optional<String> result = getNameGood(false);
        //System.out.println(name.get()); // another bad thing to do with Optional, it defeats the purpose
        System.out.println(result.orElse(" unknown Name "));

        //System.out.println(result.orElseThrow());
    }
}
