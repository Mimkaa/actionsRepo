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
        System.out.println("Attempting to press ',' (comma) key using Robot...");
        try {
            Robot robot = new Robot();
            robot.setAutoDelay(50);
            robot.keyPress(44);
            robot.keyRelease(44);
            System.out.println("Done: pressed ',' (comma).");
        }
        catch (Throwable throwable) {
            System.out.println("Failed to press key: " + throwable);
            throwable.printStackTrace();
        }
        try {
            new File(".ready").createNewFile();
            System.out.println("Created .ready");
        }
        catch (Throwable throwable) {
            System.out.println("Could not create .ready: " + throwable);
        }
    }
}
