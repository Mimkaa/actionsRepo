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
        System.out.println("Pressing [ key...");
        try {
            Robot robot = new Robot();
            robot.setAutoDelay(50);
            robot.keyPress(91);
            robot.keyRelease(91);
            System.out.println("Done.");
            File file = new File(".ready");
            if (!file.exists()) {
                file.createNewFile();
            }
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
