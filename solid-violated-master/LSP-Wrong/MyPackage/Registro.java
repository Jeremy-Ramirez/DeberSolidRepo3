import control.Usuario;

public class Registro {

	
	public static void registrarUsuario(User u) {
		

		
		if(u.firstName.length() == 0){
	        System.out.println("First name cannot be empty");
	        
	    }

	    if(u.lastName.length() == 0){
	         System.out.println("Last name cannot be empty");
	      
	     }

	     if(!u.emailAddress.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$")){
	         System.out.println("Invalid email address format");
	         
	     }
	     
	     else {

		      System.out.println("User Created Successfully");

		      System.out.println("Sending Email to User");

		      System.out.println("To: "+ u.emailAddress);
		      System.out.println("Subject: Welcome Email to User");
		      System.out.println("Body:");
		      System.out.format("Hi %s %s,",u.firstName, u.lastName);
		      System.out.println("Welcome to CodHer! \nWe are happy to have you as a user :-) ");
	     }
	     
	     
		
	}
	
	
	
}
