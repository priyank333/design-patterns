package structural.proxy.runcmd;

import java.io.IOException;
import java.util.Optional;

public class CommandExecutorImpl implements CommandExecutor {
    @Override
    public Optional<Process> runCommand(String command) {
        try {
            Process process = Runtime.getRuntime().exec(command);
            System.out.println("Command : " + command + " is executed successfully.");
            return Optional.ofNullable(process);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
