/*
 * Decompiled with CFR 0.152.
 */
import java.awt.AWTException;
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
        System.out.println("Pressing key: 9");
        try {
            try {
                Robot robot = new Robot();
                robot.setAutoDelay(50);
                robot.keyPress(57);
                robot.keyRelease(57);
                System.out.println("Done");
            }
            catch (AWTException aWTException) {
                System.out.println("Robot unavailable: " + aWTException);
            }
        }
        finally {
            try {
                Files.writeString(Paths.get(".ready", new String[0]), (CharSequence)"", new OpenOption[0]);
            }
            catch (Exception exception) {}
        }
    }
}
