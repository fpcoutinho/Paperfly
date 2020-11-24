package business.model;

import java.util.List;
import java.util.Map;

public class Manager extends User {
    private List<Employee> employees;
    private Map<Employee, Long> payCut;

    public Manager(String user, String password) {
        super(user, password);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Map<Employee, Long> getPayCut() {
        return payCut;
    }

    public void setPayCut(Map<Employee, Long> payCut) {
        this.payCut = payCut;
    }
}
