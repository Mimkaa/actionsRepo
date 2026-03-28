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
        System.out.println("Pressing ] key...");
        try {
            Robot robot = new Robot();
            robot.keyPress(93);
            robot.keyRelease(93);
            System.out.println("Done.");
        }
        catch (AWTException aWTException) {
            System.out.println("Robot failed: " + aWTException);
        }
        try {
            Files.write(Paths.get(".ready", new String[0]), "ready".getBytes(StandardCharsets.UTF_8), new OpenOption[0]);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }
}
