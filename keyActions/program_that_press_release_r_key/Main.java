/*
 * Decompiled with CFR 0.152.
 */
import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;

public class Main {
    private String name;

    public String sayHello() {
        return "Hello from Main!";
    }

    public static void main(String[] stringArray) {
        System.out.println("Pressing r key...");
        try {
            Robot robot = new Robot();
            robot.setAutoDelay(50);
            robot.keyPress(82);
            robot.keyRelease(82);
            System.out.println("Done.");
        }
        catch (AWTException aWTException) {
            System.out.println("Robot failed: " + aWTException);
        }
        try {
            new File(".ready").createNewFile();
            System.out.println(".ready created.");
        }
        catch (IOException iOException) {
            System.out.println("Failed to create .ready: " + iOException);
        }
    }
}
