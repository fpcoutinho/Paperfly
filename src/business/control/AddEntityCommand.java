package business.control;

/* Concrete Command 1 */
public class AddEntityCommand implements Command{
    private ControlCmd theControl;
    private Entity entity;

    public AddEntityCommand(Entity entity) {
        this.entity = entity;
    }

    @Override
    public void execute() {
        theControl.addEntity(entity);
    }
}
