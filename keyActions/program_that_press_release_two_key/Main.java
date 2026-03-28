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
        System.out.println("Pressing 2 key...");
        try {
            Robot robot = new Robot();
            robot.setAutoDelay(50);
            robot.keyPress(50);
            robot.keyRelease(50);
            System.out.println("Done.");
        }
        catch (Throwable throwable) {
            System.out.println("Robot failed: " + throwable);
            throwable.printStackTrace(System.out);
        }
        try {
            new File(".ready").createNewFile();
            System.out.println("Created .ready");
        }
        catch (Throwable throwable) {
            System.out.println("Failed to create .ready: " + throwable);
            throwable.printStackTrace(System.out);
        }
    }
}
