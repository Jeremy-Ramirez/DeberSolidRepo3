package MyPackage;

public class Program {
    public static void main(String[] args) {
       Manager employee = new Manager();
       employee.firstName = "Emma";
       employee.lastName = "Jackson";
       employee.calculatePerHourRate(4);

       Employee emp = new Ceo();
       emp.firstName = "Tim";
       emp.lastName = "corey";
       emp.AssignManager(employee);
       emp.calculatePerHourRate(2);

       System.out.println("Salary : "+ emp.salary + " Name: "+ emp.firstName);
    }
}
