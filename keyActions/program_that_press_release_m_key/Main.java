/*
 * Decompiled with CFR 0.152.
 */
import java.awt.AWTException;
import java.awt.Robot;

public class Main {
    private String name;

    public String sayHello() {
        return "Hello from Main!";
    }

    public static void main(String[] stringArray) {
        System.out.println("Pressing 'm' key in 500ms...");
        try {
            Robot robot = new Robot();
            robot.delay(500);
            robot.keyPress(77);
            robot.keyRelease(77);
            System.out.println("Done.");
        }
        catch (AWTException aWTException) {
            System.out.println("Robot/AWT not available: " + aWTException);
        }
    }
}
