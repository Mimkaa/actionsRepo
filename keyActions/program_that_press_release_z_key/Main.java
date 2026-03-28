/*
 * Decompiled with CFR 0.152.
 */
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
        Object object;
        System.out.println("About to press 'z' using java.awt.Robot...");
        try {
            object = new Robot();
            ((Robot)object).setAutoDelay(50);
            ((Robot)object).delay(500);
            ((Robot)object).keyPress(90);
            ((Robot)object).keyRelease(90);
            System.out.println("Pressed 'z'.");
        }
        catch (Exception exception) {
            System.out.println("Failed to press key: " + exception);
            exception.printStackTrace();
        }
        try {
            object = Paths.get(".ready", new String[0]);
            if (!Files.exists((Path)object, new LinkOption[0])) {
                Files.createFile((Path)object, new FileAttribute[0]);
            }
            System.out.println("Created .ready");
        }
        catch (Exception exception) {
            System.out.println("Failed to create .ready: " + exception);
            exception.printStackTrace();
        }
    }
}
