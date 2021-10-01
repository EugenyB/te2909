package command;

import java.util.ArrayList;
import java.util.List;

// Invoker
public class Switch {
    private List<Command> history = new ArrayList<>();

    public void storeAndExec(Command command) {
        history.add(command);
        command.execute();
    }
}
