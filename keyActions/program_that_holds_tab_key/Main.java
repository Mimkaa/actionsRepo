/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Robot;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Main {
    public static void main(String[] stringArray) {
        try {
            System.out.println("Pressing (HOLD) key: 9");
            Robot robot = new Robot();
            robot.setAutoDelay(30);
            robot.keyPress(9);
            System.out.println("Done (key is now held down).");
        }
        catch (Throwable throwable) {
            System.out.println("Failed to press (hold) key: " + String.valueOf(throwable));
            throwable.printStackTrace(System.out);
        }
        try {
            Files.write(Path.of(".ready", new String[0]), new byte[0], StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        }
        catch (Throwable throwable) {
            System.out.println("Failed to create .ready: " + String.valueOf(throwable));
        }
    }
}
