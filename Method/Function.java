import java.util.Scanner;
public class Function 
{
    int n1, n2;
    int add, subtract;

    void input()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two number: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        sc.close();
    }

    void process()
    {
        add = n1 + n2;
        subtract = n1 - n2;
    }
    
    void output()
    {
        System.out.println("Addition: "+add);
        System.out.println("Subtract: "+subtract);
    }
    public static void main(String[] args) 
    {
        Function obj = new Function();

        obj.input();
        obj.process();
        obj.output();
    }    
}
