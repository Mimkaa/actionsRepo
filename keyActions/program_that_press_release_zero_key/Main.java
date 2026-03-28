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
        System.out.println("Attempting to press the '0' key using java.awt.Robot...");
        try {
            object = new Robot();
            ((Robot)object).setAutoDelay(50);
            ((Robot)object).keyPress(48);
            ((Robot)object).keyRelease(48);
            System.out.println("Pressed '0'.");
        }
        catch (Throwable throwable) {
            System.out.println("Failed to press '0': " + throwable);
            throwable.printStackTrace();
        }
        try {
            object = new File(".ready");
            if (((File)object).createNewFile()) {
                System.out.println("Created .ready");
            } else {
                System.out.println(".ready already exists");
            }
        }
        catch (Throwable throwable) {
            System.out.println("Failed to create .ready: " + throwable);
            throwable.printStackTrace();
        }
    }
}
