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
        try {
            Object object;
            try {
                object = new Robot();
                ((Robot)object).keyPress(192);
                ((Robot)object).keyRelease(192);
                System.out.println("Pressed `");
            }
            catch (Throwable throwable) {
                System.out.println("Failed to press `: " + throwable);
            }
            try {
                object = Paths.get(".ready", new String[0]);
                if (!Files.exists((Path)object, new LinkOption[0])) {
                    Files.createFile((Path)object, new FileAttribute[0]);
                }
            }
            catch (Throwable throwable) {}
        }
        catch (Throwable throwable) {
            System.out.println("Unexpected error: " + throwable);
        }
    }
}
