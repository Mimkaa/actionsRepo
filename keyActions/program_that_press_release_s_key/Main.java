/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Robot;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;

public class Main {
    private String name;

    public String sayHello() {
        return "Hello from Main!";
    }

    public static void main(String[] stringArray) {
        System.out.println("Pressing 's' key...");
        try {
            Robot robot = new Robot();
            robot.setAutoDelay(50);
            robot.keyPress(83);
            robot.keyRelease(83);
            System.out.println("Done.");
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        try {
            Files.write(Paths.get(".ready", new String[0]), new byte[0], new OpenOption[0]);
            System.out.println("Created .ready");
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
