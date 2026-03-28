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
            File file = new File(".ready");
            if (!file.exists()) {
                file.createNewFile();
            }
            Robot robot = new Robot();
            robot.setAutoDelay(20);
            robot.keyPress(75);
            robot.keyRelease(75);
            System.out.println("Pressed K");
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
