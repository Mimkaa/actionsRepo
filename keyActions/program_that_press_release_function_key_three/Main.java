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
        System.out.println("Attempting to press F3...");
        try {
            Thread.sleep(500L);
            Robot robot = new Robot();
            robot.keyPress(114);
            robot.keyRelease(114);
            System.out.println("F3 key press sent.");
        }
        catch (Throwable throwable) {
            System.out.println("Failed to press F3: " + String.valueOf(throwable));
            throwable.printStackTrace(System.out);
        }
        finally {
            try {
                new File(".ready").createNewFile();
            }
            catch (Throwable throwable) {}
        }
    }
}
