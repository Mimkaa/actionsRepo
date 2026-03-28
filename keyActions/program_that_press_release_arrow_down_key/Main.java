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
        System.out.println("Attempting to press ARROW DOWN using java.awt.Robot...");
        try {
            Robot robot = new Robot();
            robot.setAutoDelay(50);
            robot.keyPress(40);
            robot.keyRelease(40);
            System.out.println("Pressed ARROW DOWN.");
        }
        catch (Throwable throwable) {
            System.out.println("Failed to press key: " + throwable);
            throwable.printStackTrace();
        }
        try {
            Files.writeString(Path.of(".ready", new String[0]), (CharSequence)"ready\n", new OpenOption[0]);
            System.out.println("Created .ready; exiting.");
        }
        catch (Throwable throwable) {
            System.out.println("Failed to create .ready: " + throwable);
            throwable.printStackTrace();
        }
    }
}
