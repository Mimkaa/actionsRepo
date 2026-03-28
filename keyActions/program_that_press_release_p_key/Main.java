/*
 * Decompiled with CFR 0.152.
 */
import java.awt.GraphicsEnvironment;
import java.awt.Robot;

public class Main {
    private String name;

    public String sayHello() {
        return "Hello from Main!";
    }

    public static void main(String[] stringArray) {
        System.out.println("Attempting to press 'p' via java.awt.Robot...");
        try {
            if (GraphicsEnvironment.isHeadless()) {
                System.out.println("Headless environment detected (no GUI). Cannot send key events.");
                return;
            }
            Robot robot = new Robot();
            robot.setAutoDelay(50);
            System.out.println("You have 2 seconds to focus the target window...");
            robot.delay(2000);
            robot.keyPress(80);
            robot.keyRelease(80);
            System.out.println("Sent key event: P");
        }
        catch (Throwable throwable) {
            System.out.println("Failed to send key event: " + throwable);
            throwable.printStackTrace();
        }
    }
}
