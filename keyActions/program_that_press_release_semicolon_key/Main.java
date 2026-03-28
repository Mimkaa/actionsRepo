/*
 * Decompiled with CFR 0.152.
 */
import java.awt.AWTException;
import java.awt.GraphicsEnvironment;
import java.awt.Robot;

public class Main {
    private String name;

    public String sayHello() {
        return "Hello from Main!";
    }

    public static void main(String[] stringArray) {
        System.out.println("Attempting to press ';' key via java.awt.Robot...");
        if (GraphicsEnvironment.isHeadless()) {
            System.out.println("Headless environment detected; cannot use Robot to press keys.");
            return;
        }
        try {
            Robot robot = new Robot();
            robot.setAutoDelay(50);
            robot.delay(500);
            robot.keyPress(59);
            robot.keyRelease(59);
            System.out.println("Pressed ';' key.");
        }
        catch (AWTException aWTException) {
            System.out.println("Failed to create Robot: " + aWTException);
        }
    }
}
