import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;

public class DeleteBWorker {

    public static void main(String[] args) {
        try {
            System.out.println("DeleteBWorker started.");

            Path baseDir = Path.of("C:", "hold_system");
            Path pidFile = baseDir.resolve("hold_b.pid");

            if (!Files.exists(pidFile)) {
                System.out.println("PID file not found: " + pidFile);
                return;
            }

            String pidStr = Files.readString(pidFile).trim();
            long pid = Long.parseLong(pidStr);

            System.out.println("Trying to kill PID: " + pid);

            Optional<ProcessHandle> handleOpt = ProcessHandle.of(pid);

            if (handleOpt.isPresent()) {
                ProcessHandle handle = handleOpt.get();

                boolean result = handle.destroy(); // graceful kill

                // fallback if needed
                if (!result) {
                    System.out.println("Graceful kill failed, forcing...");
                    handle.destroyForcibly();
                }

                System.out.println("Process terminated.");
            } else {
                System.out.println("Process not found.");
            }

            // cleanup
            Files.deleteIfExists(pidFile);
            System.out.println("PID file deleted.");

        } catch (Throwable t) {
            System.out.println("DeleteBWorker failed: " + t);
            t.printStackTrace(System.out);
        }
    }
}