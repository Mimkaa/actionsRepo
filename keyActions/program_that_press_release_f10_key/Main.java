/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Robot;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    private String name;

    public String sayHello() {
        return "Hello from Main!";
    }

    public static void main(String[] stringArray) {
        try {
            System.out.println("Pressing F10...");
            Robot robot = new Robot();
            robot.setAutoDelay(50);
            robot.keyPress(121);
            robot.keyRelease(121);
            System.out.println("Done.");
            Path path = Paths.get(".ready", new String[0]);
            if (Files.notExists(path, new LinkOption[0])) {
                Files.write(path, new byte[0], new OpenOption[0]);
            }
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
