import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            robot.setAutoDelay(20);

            System.out.println("Pressing 'backtick' key in 500ms...");
            Thread.sleep(500);

            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            System.out.println("BACKTICK DOWN");

            Thread.sleep(200);

            robot.keyRelease(KeyEvent.VK_BACK_QUOTE);
            System.out.println("BACKTICK UP");

            Thread.sleep(200);

            System.out.println("Done.");
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
