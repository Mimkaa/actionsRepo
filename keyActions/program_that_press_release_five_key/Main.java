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
        System.out.println("Pressing 5 key...");
        try {
            Robot robot = new Robot();
            robot.setAutoDelay(50);
            robot.keyPress(53);
            robot.keyRelease(53);
            System.out.println("Done.");
        }
        catch (AWTException aWTException) {
            aWTException.printStackTrace();
        }
        try {
            Files.write(Paths.get(".ready", new String[0]), "ready\n".getBytes(StandardCharsets.UTF_8), new OpenOption[0]);
            System.out.println("Created .ready");
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
