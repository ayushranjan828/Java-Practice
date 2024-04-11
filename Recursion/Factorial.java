import java.util.Scanner;
public class Factorial 
{
    int fact(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        else
        {
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) 
    {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        Factorial obj = new Factorial();

        int result = obj.fact(6);
        System.out.println("Factorial of number: "+result);

        sc.close();
    }    
}
