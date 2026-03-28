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
        try {
            object = new Robot();
            ((Robot)object).setAutoDelay(50);
            ((Robot)object).keyPress(67);
            ((Robot)object).keyRelease(67);
            System.out.println("Pressed C");
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        try {
            object = new File(".ready");
            if (((File)object).exists() && ((File)object).isDirectory()) {
                File[] fileArray = ((File)object).listFiles();
                if (fileArray != null) {
                    for (File file : fileArray) {
                        try {
                            file.delete();
                        }
                        catch (Exception exception) {
                            // empty catch block
                        }
                    }
                }
                ((File)object).delete();
            }
            new File(".ready").createNewFile();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
