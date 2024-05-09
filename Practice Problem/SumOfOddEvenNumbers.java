import java.util.Scanner;

public class SumOfOddEvenNumbers 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();

        System.out.print("Enter 'o' for sum of odd numbers or 'e' for sum of even numbers: ");
        char choice = scanner.next().charAt(0);

        int sum = 0;
        if (choice == 'o' || choice == 'O') 
        {
            for (int i = 1; i <= limit; i += 2) 
            {
                sum += i;
            }
            System.out.println("Sum of odd numbers up to " + limit + " is: " + sum);
        } 
        else if (choice == 'e' || choice == 'E') 
        
        {
            for (int i = 2; i <= limit; i += 2) 
            {
                sum += i;
            }
            System.out.println("Sum of even numbers up to " + limit + " is: " + sum);
        } 
        else 
        {
            System.out.println("Invalid choice. Please enter 'o' or 'e'.");
        }

        scanner.close();
    }
}
