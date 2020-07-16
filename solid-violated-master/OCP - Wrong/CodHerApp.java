public class CodHerApp {
    public static void main(final String[] args) {

     User user = User.create();

     if(!UserValidator.isValid(user)){
        return;
     }

     MailProvider mailProvider = new MailProvider();
     mailProvider.sendWelcomeEmail(user);

     PaymentProvider paymentProvider = new PaymentProvider();
     paymentProvider.makePayment(100);
     
    }
 }