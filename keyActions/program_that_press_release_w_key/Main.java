/*
 * Decompiled with CFR 0.152.
 */
import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;

public class Main {
    private String name;

    public String sayHello() {
        return "Hello from Main!";
    }

    public static void main(String[] stringArray) {
        System.out.println("Pressing W via java.awt.Robot...");
        try {
            Robot robot = new Robot();
            robot.keyPress(87);
            robot.delay(100);
            robot.keyRelease(87);
            System.out.println("Done.");
        }
        catch (AWTException aWTException) {
            System.out.println("Robot failed: " + aWTException);
        }
        try {
            new File(".ready").createNewFile();
            System.out.println("Created .ready file.");
        }
        catch (Exception exception) {
            System.out.println("Failed to create .ready file: " + exception);
        }
    }
}
