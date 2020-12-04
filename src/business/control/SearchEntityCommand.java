package business.control;

/* Concrete Command 3 */
public class SearchEntityCommand implements  Command {
    private ControlCmd theControl;
    private int position;

    public SearchEntityCommand(int position) {
        this.position = position;
    }

    @Override
    public void execute() {
        theControl.searchEntity(position);
    }
}
