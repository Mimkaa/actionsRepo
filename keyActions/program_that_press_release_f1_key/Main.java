/*
 * Decompiled with CFR 0.152.
 */
import java.awt.GraphicsEnvironment;
import java.awt.Robot;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;

public class Main {
    private String name;

    public String sayHello() {
        return "Hello from Main!";
    }

    public static void main(String[] stringArray) {
        try {
            System.setProperty("java.awt.headless", "false");
            System.out.println("headless=" + GraphicsEnvironment.isHeadless());
            Robot robot = new Robot();
            robot.setAutoDelay(50);
            System.out.println("Sleeping 1000ms before keypress...");
            robot.delay(1000);
            robot.keyPress(112);
            robot.keyRelease(112);
            System.out.println("Pressed F1 via Robot.");
            Path path = Paths.get(".ready", new String[0]);
            try {
                if (Files.exists(path, new LinkOption[0])) {
                    if (Files.isDirectory(path, new LinkOption[0])) {
                        Files.delete(path);
                    } else {
                        System.out.println(".ready already exists as a file.");
                        return;
                    }
                }
                Files.createFile(path, new FileAttribute[0]);
                System.out.println("Created .ready file.");
            }
            catch (Throwable throwable) {
                System.out.println("Could not create .ready: " + throwable);
                throwable.printStackTrace(System.out);
            }
        }
        catch (Throwable throwable) {
            System.out.println("FAILED to press F1: " + throwable);
            throwable.printStackTrace(System.out);
        }
    }
}
