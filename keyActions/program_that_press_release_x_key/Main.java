/*
 * Decompiled with CFR 0.152.
 */
import java.awt.AWTException;
import java.awt.HeadlessException;
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
        try {
            System.out.println("Pressing X key via java.awt.Robot...");
            object = new Robot();
            ((Robot)object).setAutoDelay(50);
            ((Robot)object).keyPress(88);
            ((Robot)object).keyRelease(88);
            System.out.println("Done pressing X.");
        }
        catch (AWTException aWTException) {
            System.out.println("AWTException: " + aWTException);
        }
        catch (HeadlessException headlessException) {
            System.out.println("HeadlessException (no GUI available): " + headlessException);
        }
        try {
            object = Paths.get(".ready", new String[0]);
            if (Files.exists((Path)object, new LinkOption[0])) {
                if (Files.isDirectory((Path)object, new LinkOption[0])) {
                    System.out.println(".ready exists but is a directory; leaving as-is.");
                } else {
                    System.out.println(".ready file already exists.");
                }
            } else {
                Files.createFile((Path)object, new FileAttribute[0]);
                System.out.println("Created .ready file.");
            }
        }
        catch (Exception exception) {
            System.out.println("Failed to create .ready file: " + exception);
        }
    }
}
