/*
 * Decompiled with CFR 0.152.
 */
import java.awt.GraphicsEnvironment;
import java.awt.Robot;
import java.io.File;

public class Main {
    private String name;

    public String sayHello() {
        return "Hello from Main!";
    }

    public static void main(String[] stringArray) {
        Object object;
        System.out.println("Attempting to press 'e' key via java.awt.Robot...");
        try {
            if (GraphicsEnvironment.isHeadless()) {
                System.out.println("Headless environment detected; Robot cannot run.");
            } else {
                object = new Robot();
                ((Robot)object).setAutoDelay(40);
                System.out.println("Focus the target window now (2s)...");
                Thread.sleep(2000L);
                ((Robot)object).keyPress(69);
                ((Robot)object).keyRelease(69);
                System.out.println("Pressed 'e'.");
            }
        }
        catch (Throwable throwable) {
            System.out.println("Robot keypress failed: " + throwable);
            throwable.printStackTrace(System.out);
        }
        try {
            object = new File(".ready");
            if (((File)object).exists()) {
                System.out.println(".ready already exists.");
            } else {
                boolean bl = ((File)object).createNewFile();
                System.out.println("Created .ready file: " + bl);
            }
        }
        catch (Throwable throwable) {
            System.out.println("Failed to create .ready file: " + throwable);
            throwable.printStackTrace(System.out);
        }
    }
}
