package system;

import java.awt.*;

public class MouseMover {

    public static void main(String[] args) throws AWTException, InterruptedException {
        boolean toggle = false;
        Robot robot = new Robot();
        Point point = MouseInfo.getPointerInfo().getLocation();
        while (true) {

            if (toggle) {
                robot.mouseMove(point.x, point.y);
                System.out.println("Mouse moved to " + point.x + " - " + point.y);
            } else {
                robot.mouseMove(point.x + 1, point.y + 1);
                System.out.println("Mouse moved to " + (point.x + 1) + " - " + (point.y + 1));
            }
            toggle = !toggle;
            Thread.sleep(20000);
        }
    }
}
