package structural.proxy.runcmd;

import java.util.Optional;

public class CommandExecutorProxy implements CommandExecutor {

    private String username, password;
    private CommandExecutor cmdExe;

    public CommandExecutorProxy(String username, String password) {
        this.username = username;
        this.password = password;
        cmdExe = new CommandExecutorImpl();
    }

    @Override
    public Optional<Process> runCommand(String command) {
        if (username.equals("priyank") && password.equals("priyank")) {
            return cmdExe.runCommand(command);
        } else {
            return Optional.empty();
        }
    }
}
