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
        System.out.println("Pressing BACK_SPACE in 2 seconds...");
        try {
            Thread.sleep(2000L);
            object = new Robot();
            ((Robot)object).keyPress(8);
            ((Robot)object).keyRelease(8);
            System.out.println("Done.");
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
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
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
