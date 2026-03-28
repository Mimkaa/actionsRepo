/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Robot;
import java.io.File;

public class Main {
    private String name;

    public String sayHello() {
        return "Hello from Main!";
    }

    public static void main(String[] stringArray) {
        Object object;
        System.out.println("Attempting to press 'i' key using java.awt.Robot...");
        try {
            object = new Robot();
            ((Robot)object).setAutoDelay(50);
            ((Robot)object).keyPress(73);
            ((Robot)object).keyRelease(73);
            System.out.println("Done.");
        }
        catch (Throwable throwable) {
            System.out.println("Robot failed: " + throwable);
            throwable.printStackTrace();
        }
        try {
            object = new File(".ready");
            if (!((File)object).exists()) {
                boolean bl = ((File)object).createNewFile();
                System.out.println("Created .ready file: " + bl);
            } else {
                System.out.println(".ready file already exists.");
            }
        }
        catch (Throwable throwable) {
            System.out.println("Failed to create .ready file: " + throwable);
            throwable.printStackTrace();
        }
    }
}
