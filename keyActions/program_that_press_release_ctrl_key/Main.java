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
        System.out.println("Pressing CTRL key...");
        try {
            Robot robot = new Robot();
            robot.keyPress(17);
            robot.delay(100);
            robot.keyRelease(17);
            System.out.println("CTRL key press/release done.");
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
