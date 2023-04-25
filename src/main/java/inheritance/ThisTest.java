package inheritance;

public class ThisTest {
    
}


class Aa {
    public Aa() {
        this(false);
    }

    public Aa(boolean someFlag) {
    }
}

class Bb extends Aa {
    public Bb() {
        super();
    }

    public Bb(boolean someFlag) {
        super(someFlag);
    }

    public Bb(int someNumber) {
        this(); //
    }
}