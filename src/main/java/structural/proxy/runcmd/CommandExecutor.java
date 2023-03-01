package structural.proxy.runcmd;

import java.util.Optional;

public interface CommandExecutor {

    public Optional<Process> runCommand(String command);

}
