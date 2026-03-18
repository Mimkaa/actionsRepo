import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {
        try {

            String javaBin = System.getProperty("java.home") + "\\bin\\java.exe";
            String classpath = System.getProperty("java.class.path");

            ProcessBuilder pb = new ProcessBuilder(
                    javaBin,
                    "-cp",
                    classpath,
                    "HoldBWorker"
            );

            // Do NOT inherit IO → makes it detached from this console
            pb.redirectOutput(ProcessBuilder.Redirect.DISCARD);
            pb.redirectError(ProcessBuilder.Redirect.DISCARD);

            Process process = pb.start();
            long pid = process.pid();

            Path baseDir = Path.of("C:", "hold_system");
            Files.createDirectories(baseDir);

            Path pidFile = baseDir.resolve("hold_b.pid");

            Files.writeString(pidFile, Long.toString(pid));

            System.out.println("Spawned HoldBWorker with PID: " + pid);
            System.out.println("PID stored at: " + pidFile);
            System.out.println("Main exiting. Worker continues running.");

        } catch (Throwable t) {
            System.out.println("Failed to spawn HoldBWorker: " + t);
            t.printStackTrace(System.out);
        }
    }
}