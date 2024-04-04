import java.util.Scanner;

public class input
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer value: ");
        int a = sc.nextInt();

        System.out.print("Enter String: ");
        String b = sc.nextLine();
        sc.nextLine();

        System.out.print("Enter Floating Value: ");
        float c = sc.nextFloat();

        System.out.println("Enter integer was "+a);
        System.out.println("Enter String was "+b);
        System.out.println("Enter Floating value was "+c);

        sc.close();
    }
}
