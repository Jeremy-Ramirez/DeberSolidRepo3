package MyPackage1;

public class HumanWorker implements IWorker {
    @Override
    public void signIn() {
        System.out.println("Hey I'm just signing in");
    }

    @Override
    public void startWork() {
        System.out.println("Hey I'm starting to work");
    }

    @Override
    public void teaBreak() {
        System.out.println("Hey I'm taking a tea break");
    }

    @Override
    public void continueWork() {
        System.out.println("Hey I'm working");
    }

    @Override
    public void lunch() {
        System.out.println("Hey I'm having lunch");
    }

    @Override
    public void signOut() {
        System.out.println("Hey I'm just signing out");
    }

    @Override
    public void recharge() {
        System.out.println("Sorry no implementation for this");
    }

    @Override
    public void oilCheck() {
        System.out.println("Sorry no implementation for this");
    }
}
