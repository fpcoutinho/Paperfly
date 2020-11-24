package business.model;

public class Employee extends User {

    private Long salary;
    private int daysWorked;
    private boolean paidVacation;
    private static final int A_YEAR_WORKED = 365;

    public Employee(String user, String password) {
        super(user, password);
    }

    public int getDaysWorked() {
        return daysWorked;
    }

    public boolean isPaidVacation() {
        return this.paidVacation;
    }

    public void setDaysWorked(int daysWorked) {
        this.daysWorked = daysWorked;
    }

    public void setPaidVacation() {
        if(this.daysWorked == A_YEAR_WORKED)
            this.paidVacation = true;
        this.paidVacation = false;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
}
