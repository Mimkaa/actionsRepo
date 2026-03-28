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
        System.out.println("Pressing '.' via java.awt.Robot ...");
        try {
            if (GraphicsEnvironment.isHeadless()) {
                System.out.println("Headless environment detected; Robot cannot be used.");
            } else {
                object = new Robot();
                ((Robot)object).setAutoDelay(50);
                ((Robot)object).delay(500);
                ((Robot)object).keyPress(46);
                ((Robot)object).keyRelease(46);
                System.out.println("Done (VK_PERIOD pressed and released).");
            }
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        try {
            object = new File(".ready");
            if (((File)object).createNewFile()) {
                System.out.println("Created termination file: .ready");
            } else {
                System.out.println("Termination file already exists: .ready");
            }
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
