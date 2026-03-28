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
        System.out.println("About to press UP arrow...");
        try {
            Robot robot = new Robot();
            robot.setAutoDelay(50);
            robot.delay(300);
            robot.keyPress(38);
            robot.keyRelease(38);
            System.out.println("Pressed UP arrow.");
        }
        catch (AWTException aWTException) {
            aWTException.printStackTrace();
        }
    }
}
