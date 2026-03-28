/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Robot;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;

public class Main {
    private String name;

    public String sayHello() {
        return "Hello from Main!";
    }

    public static void main(String[] stringArray) {
        try {
            System.out.println("About to press F5 in 1 second...");
            Thread.sleep(1000L);
            Robot robot = new Robot();
            robot.keyPress(116);
            robot.keyRelease(116);
            System.out.println("Pressed F5.");
            try {
                Files.writeString(Path.of(".ready", new String[0]), (CharSequence)"done\n", new OpenOption[0]);
                System.out.println("Created .ready");
            }
            catch (Exception exception) {
                System.out.println("Failed to create .ready: " + exception);
            }
        }
        catch (Exception exception) {
            System.out.println("Error while pressing F5: " + exception);
        }
    }
}
