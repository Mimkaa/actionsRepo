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
        System.out.println("Attempting to press DELETE key via java.awt.Robot...");
        try {
            Robot robot = new Robot();
            robot.setAutoDelay(50);
            Thread.sleep(1500L);
            robot.keyPress(127);
            robot.keyRelease(127);
            System.out.println("DELETE key press+release sent.");
        }
        catch (AWTException aWTException) {
            System.out.println("Failed to create Robot (AWTException): " + aWTException);
            aWTException.printStackTrace();
        }
        catch (InterruptedException interruptedException) {
            System.out.println("Interrupted while waiting: " + interruptedException);
            interruptedException.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
