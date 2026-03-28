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
            Thread.sleep(2000L);
            Robot robot = new Robot();
            robot.setAutoDelay(40);
            robot.keyPress(72);
            robot.keyRelease(72);
            System.out.println("Pressed H key");
            new File(".ready").createNewFile();
            System.out.println("Created .ready");
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
