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
        System.out.println("Pressing F11 in 2 seconds...");
        try {
            Thread.sleep(2000L);
            Robot robot = new Robot();
            robot.keyPress(122);
            robot.keyRelease(122);
            System.out.println("Done.");
            File file = new File(".ready");
            if (file.createNewFile()) {
                System.out.println("Created .ready");
            } else {
                System.out.println(".ready already exists");
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
