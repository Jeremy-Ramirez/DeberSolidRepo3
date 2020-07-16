package MyPackage1;

import MyPackage1.IWorker;

public class Robot implements IRobot {
    @Override
    public void signIn() {
        System.out.println("Hey I'm just signing in");
    }

    @Override
    public void startWork() {
        System.out.println("Hey I'm starting to work");
    }

    @Override
    public void continueWork() {
        System.out.println("Hey I'm working");
    }


    @Override
    public void signOut() {
        System.out.println("Hey I'm just signing out");
    }

    @Override
    public void recharge() {
        System.out.println("Hey I'm plugging in to recharge");
    }

    @Override
    public void oilCheck() {
        System.out.println("Hey I'm checking my oil level");
    }
}
