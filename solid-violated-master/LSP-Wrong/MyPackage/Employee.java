package MyPackage;

public class Employee {
    public String firstName;
    public String lastName;
    public Employee manager;
    public double salary;

    public void AssignManager(Employee manager)  {
        this.manager = manager;
    }

    public void calculatePerHourRate(int rank){
        double baseAmount = 12.50;
        this.salary = baseAmount + (rank * 2);
    }
}
