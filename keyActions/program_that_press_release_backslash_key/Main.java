/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Robot;

public class Main {
    private String name;

    public String sayHello() {
        return "Hello from Main!";
    }

    public static void main(String[] stringArray) {
        System.out.println("Attempting to press \\\\ key via java.awt.Robot...");
        try {
            Robot robot = new Robot();
            robot.setAutoDelay(50);
            robot.delay(300);
            robot.keyPress(92);
            robot.keyRelease(92);
            System.out.println("Done (pressed and released \\\\). Ensure a text field has focus to observe output.");
        }
        catch (Throwable throwable) {
            System.out.println("Robot keypress failed: " + throwable);
            throwable.printStackTrace(System.out);
        }
    }
}
