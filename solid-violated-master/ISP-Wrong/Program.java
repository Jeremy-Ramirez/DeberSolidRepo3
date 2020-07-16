package MyPackage1;

public class Program {
    public static void main(String args[]){
        IWorker human = new HumanWorker();
        human.signIn();
        human.recharge();
        IWorker robot = new Robot();
        robot.signIn();
        robot.lunch();
    }
}
