
public class CodHerApp {
    public static void main(final String[] args) {

     User user = User.create();

     if(!UserValidator.isValid(user)){
        return;
     }

     IMail mail = new WelcomeMail();
     mail.sendMail(user);

     IPayment payment = new CashPayment();
     payment.makePayment(100);
     
    }
 }
