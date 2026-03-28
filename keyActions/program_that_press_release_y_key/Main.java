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
        System.out.println("Will press 'y' in 2 seconds. Focus the target window now...");
        try {
            Thread.sleep(2000L);
            Robot robot = new Robot();
            robot.setAutoDelay(50);
            robot.keyPress(89);
            robot.keyRelease(89);
            System.out.println("Pressed 'y'.");
        }
        catch (Throwable throwable) {
            System.out.println("Failed to press 'y': " + throwable);
            throwable.printStackTrace();
        }
    }
}
