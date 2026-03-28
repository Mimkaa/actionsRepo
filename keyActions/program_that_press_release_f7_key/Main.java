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
        System.out.println("Pressing F7...");
        try {
            Robot robot = new Robot();
            robot.setAutoDelay(50);
            robot.keyPress(118);
            robot.keyRelease(118);
            System.out.println("Done.");
        }
        catch (AWTException aWTException) {
            System.out.println("Robot/AWT not available: " + aWTException);
        }
        catch (SecurityException securityException) {
            System.out.println("Security manager blocked Robot: " + securityException);
        }
        try {
            new File(".ready").createNewFile();
            System.out.println("Created .ready file.");
        }
        catch (IOException iOException) {
            System.out.println("Could not create .ready file: " + iOException);
        }
    }
}
