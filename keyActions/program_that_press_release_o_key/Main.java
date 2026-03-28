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
        System.out.println("Pressing 'o' key...");
        try {
            Robot robot = new Robot();
            robot.keyPress(79);
            robot.keyRelease(79);
            System.out.println("Done.");
        }
        catch (Throwable throwable) {
            System.out.println("Robot keypress failed: " + throwable);
        }
        try {
            new File(".ready").createNewFile();
        }
        catch (Throwable throwable) {
            System.out.println("Failed to create .ready file: " + throwable);
        }
    }
}
