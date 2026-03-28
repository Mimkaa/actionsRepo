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
        try {
            Robot robot = new Robot();
            robot.delay(500);
            robot.keyPress(71);
            robot.keyRelease(71);
            System.out.println("Pressed g");
            new File(".ready").createNewFile();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
