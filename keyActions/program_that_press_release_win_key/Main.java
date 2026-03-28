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
        System.out.println("Attempting to press WIN key via java.awt.Robot...");
        try {
            Robot robot = new Robot();
            robot.setAutoDelay(50);
            robot.keyPress(524);
            robot.keyRelease(524);
            System.out.println("WIN key press+release sent.");
        }
        catch (Throwable throwable) {
            System.out.println("Robot failed: " + throwable);
            throwable.printStackTrace();
        }
        try {
            new File(".ready").createNewFile();
            System.out.println("Created .ready file.");
        }
        catch (Throwable throwable) {
            System.out.println("Failed to create .ready file: " + throwable);
            throwable.printStackTrace();
        }
    }
}
