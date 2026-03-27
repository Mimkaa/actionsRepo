import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Main {
    public static void main(String[] stringArray) {
        Robot robot = null;
        try {
            System.out.println("Pressing (HOLD) key: e");
            robot = new Robot();
            robot.setAutoDelay(30);
            robot.keyPress(KeyEvent.VK_E);
            System.out.println("Done (key is now held down).");

            Files.write(
                Path.of(".ready"),
                new byte[0],
                StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING
            );

            Thread.sleep(Long.MAX_VALUE);

        } catch (Throwable throwable) {
            System.out.println("Failed: " + throwable);
            throwable.printStackTrace(System.out);
        } finally {
            if (robot != null) {
                try {
                    robot.keyRelease(KeyEvent.VK_E);
                    System.out.println("Released key on exit.");
                } catch (Throwable releaseError) {
                    System.out.println("Failed to release key: " + releaseError);
                    releaseError.printStackTrace(System.out);
                }
            }
        }
    }
}
