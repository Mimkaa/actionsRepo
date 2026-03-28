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
        System.out.println("Pressing 'u' key via java.awt.Robot...");
        try {
            Robot robot = new Robot();
            robot.setAutoDelay(50);
            robot.delay(500);
            robot.keyPress(85);
            robot.keyRelease(85);
            System.out.println("Done.");
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
