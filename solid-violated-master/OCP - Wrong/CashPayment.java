

public class CashPayment implements IPayment{

    public void makePayment(float amount){
        System.out.format("Making the payment for the amount %s by Cash", amount);
        System.out.println("Payment Successful");
    }



}