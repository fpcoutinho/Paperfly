package business.control;

/* Interface que define as ações do Receiver */
public interface Controlable {
    void addEntity(Entity entity);
    void attEntity(Entity updatedEntity, int listPosition);
    Entity searchEntity(int listPosition);
}
