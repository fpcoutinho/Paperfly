package business.control;
import java.util.ArrayList;

/* Receiver */
public class ControlCmd implements Controlable {
    private ArrayList<Entity> entityList = new ArrayList<Entity>();

    @Override
    public void addEntity(Entity entity) {
        entityList.add(entity);
    }

    @Override
    public void attEntity(Entity updatedEntity, int listPosition) {
        entityList.set(listPosition, updatedEntity);
    }

    @Override
    public Entity searchEntity(int listPosition) {
        return entityList.get(listPosition);
    }
}
