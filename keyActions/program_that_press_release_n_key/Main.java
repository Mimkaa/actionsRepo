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
        System.out.println("Pressing 'n' key via java.awt.Robot...");
        try {
            Robot robot = new Robot();
            robot.setAutoDelay(50);
            robot.keyPress(78);
            robot.keyRelease(78);
            System.out.println("Done.");
        }
        catch (Exception exception) {
            System.out.println("Failed to press key: " + exception);
            exception.printStackTrace();
        }
    }
}
