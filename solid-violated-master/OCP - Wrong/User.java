import java.util.Scanner;
public class User {
    public String firstName;
    public String lastName;
    public String emailAddress;

    public User(final String firstName, final String lastName, final String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
    }

    public static User create() {

        final Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first name :");
        final String firstName = sc.nextLine();

        System.out.println("Enter your last name :");
        final String lastName = sc.nextLine();

        System.out.println("Enter your email address :");
        final String emailAddress = sc.nextLine();
   
        sc.close();
        
        return new User(firstName, lastName, emailAddress);
    }
}