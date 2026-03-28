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
        System.out.println("Pressing '=' key using java.awt.Robot...");
        try {
            Robot robot = new Robot();
            robot.setAutoDelay(50);
            robot.delay(300);
            robot.keyPress(61);
            robot.keyRelease(61);
            System.out.println("Done.");
        }
        catch (Throwable throwable) {
            System.out.println("Failed to press key: " + throwable);
            throwable.printStackTrace();
        }
    }
}
