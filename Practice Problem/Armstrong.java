import java.util.Scanner;
public class Armstrong
{    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        
        int numberOfDigits = String.valueOf(num).length();
        
        int sum = 0;
        while(num > 0)
        {
            int digit = num % 10;
            sum = sum + (int)Math.pow(digit, numberOfDigits);
            num = num / 10;
        }
        
        if(temp == sum)
        {
            System.out.println(temp + " is an Armstrong number.");
        }
        else
        {
            System.out.println(temp + " is not a Armstrong number.");
        }
    }
}    