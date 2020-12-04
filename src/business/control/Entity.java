package business.control;
import java.util.List;
import java.util.ArrayList;

/* Invoker */
public class Entity {
    // Histórico de comandos
    private List<Command> history = new ArrayList<Command>();

    public void storeAndExecute(Command command) {
        this.history.add(command);
        command.execute();
    }
}
