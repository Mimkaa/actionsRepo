/*
 * Decompiled with CFR 0.151.
 */
import java.awt.Robot;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;

public class Main {
    private String name;

    public String sayHello() {
        return "Hello from Main!";
    }

    public static void main(String[] stringArray) {
        System.out.println("Attempting left mouse click...");
        try {
            new Main().leftClick();
            System.out.println("Left click performed.");
        }
        catch (Throwable throwable) {
            System.out.println("Failed to click (likely headless/permission issue):");
            throwable.printStackTrace();
        }
        finally {
            try {
                Files.write(Paths.get(".ready", new String[0]), new byte[0], new OpenOption[0]);
                System.out.println("Created .ready (pipeline will terminate).");
            }
            catch (Throwable throwable) {
                System.out.println("Failed to create .ready:");
                throwable.printStackTrace();
            }
        }
    }

    public void leftClick() throws Exception {
        Robot robot = new Robot();
        robot.setAutoDelay(20);
        robot.mousePress(1024);
        robot.mouseRelease(1024);
    }
}
