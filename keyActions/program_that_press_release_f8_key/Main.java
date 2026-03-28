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
        try {
            System.out.println("Pressing F8 in 1 second...");
            Thread.sleep(1000L);
            Robot robot = new Robot();
            robot.keyPress(119);
            robot.keyRelease(119);
            System.out.println("F8 key press sent.");
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
