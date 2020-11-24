package business.control;

import business.model.User;

import java.util.TreeSet;

public class ControllerFacade extends UserControl {
    private static ControllerFacade instance = new ControllerFacade();

    private ControllerFacade(){
        super();
    }

    public static ControllerFacade getInstance(){
        if(ControllerFacade.instance == null) {
            ControllerFacade.instance = new ControllerFacade();
            return ControllerFacade.instance;
        }
        return null;
    }

    @Override
    public void setFilePath(String filePath) {
        super.setFilePath(filePath);
    }

    @Override
    public void addUser(User user) {
        super.addUser(user);
    }

    @Override
    public String listAll() {
        return super.listAll();
    }

    @Override
    public String list(String login) throws Exception {
        return super.list(login);
    }

    @Override
    public TreeSet<User> listUsersOrderByLogin() {
        return super.listUsersOrderByLogin();
    }

    @Override
    public boolean deleteUser(String login) throws Exception {
        return super.deleteUser(login);
    }
}
