package MyPackage;

public class Manager extends Employee {
    @Override
    public void calculatePerHourRate(int rank) {
        double baseAmount = 19.75;
        this.salary = baseAmount + (rank * 4);
    }

    public void generatePerformanceReview(){
        System.out.println("Im reviewing a direct report's performance");
    }
}
