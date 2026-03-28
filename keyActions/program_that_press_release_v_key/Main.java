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
            Robot robot = new Robot();
            robot.delay(500);
            robot.keyPress(86);
            robot.keyRelease(86);
            System.out.println("Pressed V");
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
