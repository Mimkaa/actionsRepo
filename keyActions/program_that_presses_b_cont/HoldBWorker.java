import java.awt.Robot;
import java.awt.event.KeyEvent;

public class HoldBWorker {

    public static void main(String[] args) {
        try {
            System.out.println("HoldBWorker started.");

            Robot robot = new Robot();
            robot.setAutoDelay(10);

            while (true) {
                robot.keyPress(KeyEvent.VK_B);
                robot.keyRelease(KeyEvent.VK_B);
                Thread.sleep(30);
            }

        } catch (Throwable t) {
            System.out.println("HoldBWorker failed: " + t);
            t.printStackTrace(System.out);
        }
    }
}