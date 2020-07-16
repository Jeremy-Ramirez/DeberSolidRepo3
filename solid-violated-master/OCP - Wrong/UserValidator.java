
public class UserValidator {

    public static boolean isValid(User user){

        if(user.firstName.length() == 0){
            System.out.println("First name cannot be empty");
            return false;
        }
   
        if(user.lastName.length() == 0){
             System.out.println("Last name cannot be empty");
             return false;
         }
   
         if(!user.emailAddress.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$")){
             System.out.println("Invalid email address format");
             return false;
         }

         return true;
    }
}