/*
 * Decompiled with CFR 0.152.
 */
import java.awt.GraphicsEnvironment;
import java.awt.Robot;

public class Main {
    private String name;

    public String sayHello() {
        return "Hello from Main!";
    }

    public static void main(String[] stringArray) {
        try {
            if (GraphicsEnvironment.isHeadless()) {
                System.out.println("Cannot press ESC: AWT is headless in this environment.");
                return;
            }
            Robot robot = new Robot();
            robot.setAutoDelay(50);
            robot.keyPress(27);
            robot.keyRelease(27);
            System.out.println("Pressed ESC");
        }
        catch (Throwable throwable) {
            System.out.println("Failed to press ESC: " + throwable);
            throwable.printStackTrace();
        }
    }
}
