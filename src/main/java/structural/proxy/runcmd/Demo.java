package structural.proxy.runcmd;

import java.io.IOException;
import java.util.Optional;

public class Demo {
    public static void main(String[] args) {
        CommandExecutor cmdExeWithPermission = new CommandExecutorProxy("priydank", "priyank");
        Optional<Process> process = cmdExeWithPermission.runCommand("ls");
        if (process.isPresent()) {
            try {
                System.out.println(new String(process.get().getInputStream().readAllBytes()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("No permissions");
        }

        CommandExecutor cmdExe = new CommandExecutorImpl();
        process = cmdExe.runCommand("ls");
        if (process.isPresent()) {
            try {
                System.out.println(new String(process.get().getInputStream().readAllBytes()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
