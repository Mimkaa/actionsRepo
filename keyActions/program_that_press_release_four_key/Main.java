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
        try {
            Robot robot = new Robot();
            robot.keyPress(52);
            robot.keyRelease(52);
            System.out.println("Pressed 4");
        }
        catch (Throwable throwable) {
            System.out.println("Robot failed: " + throwable);
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
