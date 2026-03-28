/*
 * Decompiled with CFR 0.152.
 */
import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;

public class Main {
    private String name;

    public String sayHello() {
        return "Hello from Main!";
    }

    public static void main(String[] stringArray) {
        Object object;
        System.out.println("Pressing the apostrophe (') key using java.awt.Robot...");
        try {
            object = new Robot();
            ((Robot)object).setAutoDelay(20);
            ((Robot)object).delay(300);
            ((Robot)object).keyPress(222);
            ((Robot)object).keyRelease(222);
            System.out.println("Done.");
        }
        catch (AWTException aWTException) {
            System.out.println("Robot failed: " + aWTException);
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
        }
    }
}
