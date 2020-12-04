package business.control;

/* Concrete Command 2 */
public class AttEntityCommand implements Command{
    private ControlCmd theControl;
    private Entity updatedEntity;
    private int position;

    public AttEntityCommand(Entity entity, int position) {
        this.updatedEntity = entity;
        this.position = position;
    }

    @Override
    public void execute() {
        theControl.attEntity(updatedEntity, position);
    }
}
