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
                    "DeleteBWorker"
            );

            // Detached (same as before)
            pb.redirectOutput(ProcessBuilder.Redirect.DISCARD);
            pb.redirectError(ProcessBuilder.Redirect.DISCARD);

            Process process = pb.start();
            long pid = process.pid();

            Path baseDir = Path.of("C:", "hold_system");
            Files.createDirectories(baseDir);

            Path pidFile = baseDir.resolve("delete_b.pid");
            Files.writeString(pidFile, Long.toString(pid));

            System.out.println("Spawned DeleteBWorker with PID: " + pid);
            System.out.println("Main exiting.");

        } catch (Throwable t) {
            System.out.println("Failed to spawn DeleteBWorker: " + t);
            t.printStackTrace(System.out);
        }
    }
}