package java8.sealedexample;

/**
 *  final class BrokenLight implements TrafficLight {} // Not allowed due to sealed hierarchy.
 */
public class TrafficLightRunner {
    public static void main(String[] args) {
        TrafficLight light = new RedLight();

        System.out.println(light);
    }
}
