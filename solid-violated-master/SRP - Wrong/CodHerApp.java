import java.util.Scanner;

public class CodHerApp {
    public static void main(final String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter your first name :");
     String firstName = sc.nextLine(); 

     System.out.println("Enter your last name :");
     String lastName = sc.nextLine(); 

     System.out.println("Enter your email address :");
     String emailAddress = sc.nextLine();

     sc.close();

     if(firstName.length() == 0){
         System.out.println("First name cannot be empty");
         return;
     }

     if(lastName.length() == 0){
          System.out.println("Last name cannot be empty");
          return;
      }

      if(!emailAddress.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$")){
          System.out.println("Invalid email address format");
          return;
      }

      User user = new User(firstName, lastName, emailAddress);

      System.out.println("User Created Successfully");

      System.out.println("Sending Email to User");

      System.out.println("To: "+ user.emailAddress);
      System.out.println("Subject: Welcome Email to User");
      System.out.println("Body:");
      System.out.format("Hi %s %s,",user.firstName, user.lastName);
      System.out.println("Welcome to CodHer! \nWe are happy to have you as a user :-) ");

    }
 }