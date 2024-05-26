import java.util.Scanner;

public class FibonacciSeries 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        
        System.out.println("Fibonacci Series:");
        int a = 0, b = 1;
        
        for (int i = 0; i < n; i++) 
        {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
        
        scanner.close();
    }
}
