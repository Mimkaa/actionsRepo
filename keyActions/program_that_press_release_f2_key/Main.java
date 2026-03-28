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
        System.out.println("Pressing F2 in 2 seconds...");
        try {
            Thread.sleep(2000L);
            Robot robot = new Robot();
            robot.setAutoDelay(50);
            robot.keyPress(113);
            robot.keyRelease(113);
            System.out.println("F2 pressed.");
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
            System.out.println("Interrupted; aborting.");
        }
        catch (AWTException aWTException) {
            System.out.println("Failed to create Robot: " + aWTException);
        }
    }
}
