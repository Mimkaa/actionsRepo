/*
 * Decompiled with CFR 0.152.
 */
import java.awt.AWTException;
import java.awt.Robot;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;

public class Main {
    private String name;

    public String sayHello() {
        return "Hello from Main!";
    }

    public static void main(String[] stringArray) {
        try {
            System.out.println("Attempting to press key '7' via java.awt.Robot...");
            Robot robot = new Robot();
            robot.setAutoDelay(50);
            robot.delay(300);
            robot.keyPress(55);
            robot.keyRelease(55);
            System.out.println("Pressed '7'.");
        }
        catch (AWTException aWTException) {
            System.out.println("Failed to create Robot (AWTException): " + aWTException);
            aWTException.printStackTrace();
        }
        catch (Throwable throwable) {
            System.out.println("Unexpected error: " + throwable);
            throwable.printStackTrace();
        }
        try {
            Files.write(Paths.get(".ready", new String[0]), "done".getBytes(StandardCharsets.UTF_8), new OpenOption[0]);
            System.out.println("Created .ready");
        }
        catch (Throwable throwable) {
            System.out.println("Failed to create .ready: " + throwable);
        }
    }
}
