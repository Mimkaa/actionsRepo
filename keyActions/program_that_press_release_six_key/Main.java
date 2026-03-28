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
        System.out.println("Pressing 6 key in 500ms...");
        try {
            Robot robot = new Robot();
            robot.setAutoDelay(50);
            robot.delay(500);
            robot.keyPress(54);
            robot.keyRelease(54);
            System.out.println("Done (pressed 6).");
        }
        catch (Exception exception) {
            System.out.println("Failed to press key: " + exception);
            exception.printStackTrace();
        }
    }
}
