/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Robot;
import java.io.File;

public class Main {
    private String name;

    public String sayHello() {
        return "Hello from Main!";
    }

    public static void main(String[] stringArray) {
        try {
            Robot robot = new Robot();
            robot.delay(500);
            robot.keyPress(68);
            robot.keyRelease(68);
            System.out.println("Pressed d");
        }
        catch (Throwable throwable) {
            System.out.println("Robot failed: " + throwable);
        }
        try {
            new File(".ready").createNewFile();
        }
        catch (Throwable throwable) {
            System.out.println("Ready file create failed: " + throwable);
        }
    }
}
