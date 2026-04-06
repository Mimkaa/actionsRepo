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
        System.out.println("Pressing F4 in 1 second...");
        try {
            Robot robot = new Robot();
            robot.setAutoDelay(50);
            Thread.sleep(1000L);
            robot.keyPress(115);
            robot.keyRelease(115);
            System.out.println("Done.");
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
