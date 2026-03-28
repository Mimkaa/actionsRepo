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
            robot.keyPress(84);
            robot.keyRelease(84);
            System.out.println("Pressed t");
            new File(".ready").createNewFile();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
