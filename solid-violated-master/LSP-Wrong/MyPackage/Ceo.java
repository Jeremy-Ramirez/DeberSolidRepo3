package MyPackage;

import org.omg.CORBA.SystemException;

public class Ceo extends Employee {
	

    @Override
    public void AssignManager(Employee manager)  {
        this.manager= manager;
    }

    @Override
    public void calculatePerHourRate(int rank) {
        super.calculatePerHourRate(rank);
    }

    public void fireEmployee(Employee employee){
        System.out.println("This employee has been fired");
    }

}


