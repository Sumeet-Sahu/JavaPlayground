package inheritance;

class Shape {
    public Shape makeCopy() {
        return null;
    }

}


class Circle extends Shape {

    @Override
    public Circle makeCopy() {
        return null;
    }
}

public class ShapeCopy {
    public static void main(String[] args) {
        Shape s = new Circle();
        Shape c = s.makeCopy();
    }

}