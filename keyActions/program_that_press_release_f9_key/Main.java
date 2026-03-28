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
        System.out.println("Pressing F9 in 2 seconds...");
        try {
            Thread.sleep(2000L);
            Robot robot = new Robot();
            robot.keyPress(120);
            robot.keyRelease(120);
            System.out.println("Done (F9 pressed).");
        }
        catch (Throwable throwable) {
            System.out.println("Failed to press F9: " + throwable);
            throwable.printStackTrace(System.out);
        }
        try {
            new File(".ready").createNewFile();
            System.out.println("Created .ready file.");
        }
        catch (Throwable throwable) {
            System.out.println("Failed to create .ready file: " + throwable);
        }
    }
}
