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
            System.out.println("Pressing key 8 in 1 second...");
            Thread.sleep(1000L);
            Robot robot = new Robot();
            robot.keyPress(56);
            robot.keyRelease(56);
            System.out.println("Done. Creating .ready to terminate...");
            new File(".ready").createNewFile();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
