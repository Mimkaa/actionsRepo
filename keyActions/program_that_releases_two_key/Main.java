/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Robot;

public class Main {
    public static void main(String[] stringArray) {
        try {
            System.out.println("Releasing key: two");
            Robot robot = new Robot();
            robot.setAutoDelay(30);
            robot.keyRelease(50);
            System.out.println("Done (key released).");
        }
        catch (Throwable throwable) {
            System.out.println("Failed: " + String.valueOf(throwable));
            throwable.printStackTrace(System.out);
            System.exit(1);
        }
    }
}
