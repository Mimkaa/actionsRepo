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
        System.out.println("Focusing target window... pressing RIGHT ARROW in 2 seconds");
        try {
            Thread.sleep(2000L);
            Robot robot = new Robot();
            robot.setAutoDelay(20);
            robot.keyPress(39);
            robot.keyRelease(39);
            System.out.println("Pressed RIGHT ARROW");
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
