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
        System.out.println("Pressing '/' key in 1 second...");
        try {
            Thread.sleep(1000L);
            object = new Robot();
            ((Robot)object).keyPress(47);
            ((Robot)object).keyRelease(47);
            System.out.println("Done.");
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        try {
            object = Paths.get(".ready", new String[0]);
            if (!Files.exists((Path)object, new LinkOption[0])) {
                Files.createFile((Path)object, new FileAttribute[0]);
            }
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
