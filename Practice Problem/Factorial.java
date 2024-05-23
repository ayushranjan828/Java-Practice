import java.util.Scanner;
public class Factorial
{    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of factorial upto number: ");
        int num = sc.nextInt();
        int temp = num;
        
        int fact = 1;
        for(int i = 1; i<=num; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of a number: "+fact);
    }
}    