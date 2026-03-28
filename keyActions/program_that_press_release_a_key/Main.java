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
        System.out.println("Pressing 'a' key in 2 seconds...");
        try {
            Thread.sleep(2000L);
            object = new Robot();
            ((Robot)object).setAutoDelay(50);
            ((Robot)object).keyPress(65);
            ((Robot)object).keyRelease(65);
            System.out.println("Done.");
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        try {
            object = new File(".ready");
            if (!((File)object).exists()) {
                boolean bl = ((File)object).createNewFile();
                System.out.println("Created .ready file: " + bl);
            } else {
                System.out.println(".ready already exists.");
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
