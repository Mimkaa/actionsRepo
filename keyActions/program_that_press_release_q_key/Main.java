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
        System.out.println("Attempting to press key: q");
        try {
            Robot robot = new Robot();
            robot.setAutoDelay(50);
            robot.keyPress(81);
            robot.keyRelease(81);
            System.out.println("Pressed and released: q");
        }
        catch (Throwable throwable) {
            System.out.println("Robot keypress failed: " + throwable.getClass().getName() + ": " + throwable.getMessage());
            throwable.printStackTrace(System.out);
        }
    }
}
