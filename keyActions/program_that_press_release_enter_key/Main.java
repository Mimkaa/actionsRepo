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
        System.out.println("Attempting to press ENTER key via java.awt.Robot...");
        try {
            Robot robot = new Robot();
            robot.setAutoDelay(50);
            robot.keyPress(10);
            robot.keyRelease(10);
            System.out.println("ENTER key press/release sent.");
            try {
                new File(".ready").createNewFile();
                System.out.println("Created .ready");
            }
            catch (Exception exception) {
                System.out.println("Failed to create .ready: " + exception);
            }
        }
        catch (Exception exception) {
            System.out.println("Failed to press ENTER: " + exception);
            exception.printStackTrace();
        }
    }
}
