package designpatterns;

import java.util.function.Consumer;

class Mailer {

    private Mailer() {

    }
    public Mailer from(String addr) {
        System.out.println("From..." + addr);
        return this;
    }

    public Mailer to(String addr) {
        System.out.println("To..." + addr);
        return this;
    }

    public Mailer subject(String line) {
        System.out.println("Subject..." + line);
        return this;
    }

    public Mailer body(String content) {
        System.out.println("Body..." + content);
        return this;
    }

    public static void send(Consumer<Mailer> block) {
        Mailer mailer = new Mailer();
        block.accept(mailer);
        System.out.println("Sending...");
    }
}
public class FluentInterface {
    public static void main(String[] args) {
        /**
         * Conventional way,
            Mailer mailer = new Mailer();
            mailer.from("builder@gmail.com");
            mailer.to("sumeet@gmail.com");
            mailer.subject("your code sucks...");
            mailer.body("...details...");
            mailer.send();
         */

        // Cascade Pattern
        /*
        new Mailer()
                .from("builder@gmail.com")
                .to("sumeet@gmail.com")
                .subject("your code sucks...")
                .body("...details...")
                .send();

         */

        Mailer.send(mailer -> mailer
                .from("builder@gmail.com")
                .to("sumeet@gmail.com")
                .subject("your code sucks...")
                .body("...details..."));
    }
}
