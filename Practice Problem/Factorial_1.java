import java.util.Scanner;

public class Factorial_1 
{    
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number to calculate factorial: ");
        int num = sc.nextInt();
        int temp = num;
        
        int fact = 1;
        System.out.print("Factorial of " + num + " is: ");
        for (int i = 1; i <= num; i++) 
        {
            fact = fact * i;
            if (i == 1) 
            {
                System.out.print(i);
            } else {
                System.out.print(" x " + i);
            }
        }
        System.out.println(" = " + fact);
    }
}
