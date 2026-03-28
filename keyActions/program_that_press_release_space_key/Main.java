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
            robot.keyPress(32);
            robot.keyRelease(32);
            System.out.println("Pressed SPACE");
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
