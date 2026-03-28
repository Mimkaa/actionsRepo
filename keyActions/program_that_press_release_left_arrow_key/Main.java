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
        System.out.println("Pressing LEFT arrow in 2 seconds...");
        try {
            Thread.sleep(2000L);
            Robot robot = new Robot();
            robot.keyPress(37);
            robot.keyRelease(37);
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
