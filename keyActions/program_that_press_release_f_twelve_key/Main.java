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
        System.out.println("Pressing F12...");
        try {
            Robot robot = new Robot();
            robot.setAutoDelay(50);
            robot.keyPress(123);
            robot.keyRelease(123);
            System.out.println("Done.");
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
