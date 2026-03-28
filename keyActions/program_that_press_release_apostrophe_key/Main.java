import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            robot.setAutoDelay(20);

            System.out.println("Pressing 'apostrophe' key in 500ms...");
            Thread.sleep(500);

            robot.keyPress(KeyEvent.VK_QUOTE);
            System.out.println("APOSTROPHE DOWN");

            Thread.sleep(200);

            robot.keyRelease(KeyEvent.VK_QUOTE);
            System.out.println("APOSTROPHE UP");

            Thread.sleep(200);

            System.out.println("Done.");
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
