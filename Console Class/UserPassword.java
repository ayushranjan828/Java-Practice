import java.io.Console;

class UserPassword
{
    public static void main(String[] args) 
    {
        Console obj = System.console();    

        System.out.print("Enter Username: ");
        String user = obj.readLine();

        System.out.print("Enter Password: ");
        char[] pass = obj.readPassword();

        System.out.println("Your User id: " +user);
        System.out.println("Your Password: " +pass); // System convert your password

        // Actual password we have writen
        String actual = String.valueOf(pass);
        System.out.println("Your Actual Password: " +actual);
    }
}
