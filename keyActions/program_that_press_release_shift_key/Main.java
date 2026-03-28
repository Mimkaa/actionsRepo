/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Robot;
import java.io.File;

public class Main {
    private String name;

    public String sayHello() {
        return "Hello from Main!";
    }

    public static void main(String[] stringArray) {
        System.out.println("Attempting to press SHIFT using java.awt.Robot...");
        try {
            Robot robot = new Robot();
            robot.setAutoDelay(20);
            robot.keyPress(16);
            Thread.sleep(120L);
            robot.keyRelease(16);
            System.out.println("SHIFT key press/release sent.");
        }
        catch (Throwable throwable) {
            System.out.println("Failed to press SHIFT (possibly headless/permission issue): " + throwable);
            throwable.printStackTrace();
        }
        try {
            new File(".ready").createNewFile();
            System.out.println("Created .ready");
        }
        catch (Throwable throwable) {
            System.out.println("Failed to create .ready: " + throwable);
        }
    }
}
