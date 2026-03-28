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
        System.out.println("Pressing '-' key...");
        try {
            Robot robot = new Robot();
            robot.setAutoDelay(50);
            robot.keyPress(45);
            robot.keyRelease(45);
            System.out.println("Done.");
        }
        catch (AWTException aWTException) {
            throw new RuntimeException(aWTException);
        }
    }
}
