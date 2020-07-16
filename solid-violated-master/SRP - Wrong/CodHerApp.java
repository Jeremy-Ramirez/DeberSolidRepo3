import java.util.Scanner;

import control.Registro;
import control.Usuario;

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
	     
	     User user = new Usuario(firstName, lastName, emailAddress);
	     
	     Registro. registrarUsuario(user);
 }