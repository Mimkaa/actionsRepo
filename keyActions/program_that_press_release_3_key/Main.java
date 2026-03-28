/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Robot;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Main {
    private String name;

    public String sayHello() {
        return "Hello from Main!";
    }

    public static void main(String[] stringArray) {
        try {
            System.out.println("Pressing key: 3");
            Robot robot = new Robot();
            robot.setAutoDelay(30);
            robot.keyPress(51);
            robot.keyRelease(51);
            System.out.println("Done.");
        }
        catch (Throwable throwable) {
            System.out.println("Failed to press key: " + throwable);
            throwable.printStackTrace(System.out);
        }
        try {
            Files.write(Path.of(".ready", new String[0]), new byte[0], StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        }
        catch (Throwable throwable) {
            System.out.println("Failed to create .ready: " + throwable);
        }
    }
}
