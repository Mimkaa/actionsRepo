/*
 * Decompiled with CFR 0.151.
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
            System.out.println("Right click will be pressed in 2 seconds...");
            Robot robot = new Robot();
            Thread.sleep(2000L);
            robot.mousePress(4096);
            robot.mouseRelease(4096);
            System.out.println("Right click pressed.");
            new File(".ready").createNewFile();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
