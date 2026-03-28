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
        System.out.println("Attempting to press 'j' key via java.awt.Robot...");
        try {
            object = new Robot();
            ((Robot)object).setAutoDelay(50);
            ((Robot)object).delay(500);
            ((Robot)object).keyPress(74);
            ((Robot)object).keyRelease(74);
            System.out.println("Pressed 'j'.");
        }
        catch (Exception exception) {
            System.out.println("Failed to press key: " + exception);
            exception.printStackTrace();
        }
        try {
            object = new File(".ready");
            if (((File)object).createNewFile()) {
                System.out.println("Created .ready");
            } else {
                System.out.println(".ready already exists");
            }
        }
        catch (Exception exception) {
            System.out.println("Failed to create .ready: " + exception);
            exception.printStackTrace();
        }
    }
}
