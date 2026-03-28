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
        System.out.println("Pressing 1...");
        try {
            Robot robot = new Robot();
            robot.setAutoDelay(50);
            robot.keyPress(49);
            robot.keyRelease(49);
            System.out.println("Done.");
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        try {
            new File(".ready").createNewFile();
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
