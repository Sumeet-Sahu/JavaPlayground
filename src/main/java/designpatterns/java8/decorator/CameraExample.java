package designpatterns.java8.decorator;

import java.awt.*;
import java.util.function.Function;

class Camera {

    private Function<Color, Color> filter;

    public Camera(Function<Color, Color>... filters) {
        filter = input -> input;

        for (Function<Color, Color> aFilter : filters) {
            filter = filter.andThen(aFilter);
        }
    }

    public Color snap(Color input) {
        return filter.apply(input);
    }
}

public class CameraExample {

    public static void main(String[] args) {
        printIt(new Camera());
        printIt(new Camera(Color::brighter));
        printIt(new Camera((Color::darker)));
        printIt(new Camera(Color::darker, Color::brighter, Color::brighter));
    }

    private static void printIt(Camera camera) {
        System.out.println(camera.snap(new Color(125, 125, 125)));
    }
}


