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
        try {
            System.out.println("Pressing F6 in 2 seconds...");
            Thread.sleep(2000L);
            Robot robot = new Robot();
            robot.keyPress(117);
            robot.keyRelease(117);
            System.out.println("Done.");
            new File(".ready").createNewFile();
        }
        catch (AWTException aWTException) {
            System.out.println("AWTException: " + aWTException);
        }
        catch (InterruptedException interruptedException) {
            System.out.println("Interrupted: " + interruptedException);
        }
        catch (IOException iOException) {
            System.out.println("IOException: " + iOException);
        }
    }
}
