
public class MailProvider {

    public void sendWelcomeEmail(User user){

      System.out.println("Sending Email to User");
      System.out.println("To: "+ user.emailAddress);
      System.out.println("Subject: Welcome Email to User");
      System.out.println("Body:");
      System.out.format("Hi %s %s,",user.firstName, user.lastName);
      System.out.println("Welcome to CodHer! \nWe are happy to have you as a user :-) ");
      
    }

}