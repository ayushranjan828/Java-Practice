import java.util.Scanner;

public class FirstNNaturalNumbers 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        if (n <= 0) 
        {
            System.out.println("Please enter a positive integer greater than zero.");
        } 
        else 
        {
            System.out.println("The first " + n + " natural numbers are:");
            for (int i = 1; i <= n; i++) 
            {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
