public class Types 
{
    // Instance Variable
    int b = 55;
    // Static variable
    static int c = 77;
    public static void main(String[] args)
    {
        // Local Variable
        int a = 99;

        Types obj = new Types();

        System.out.println("A = "+a);
        System.out.println("B = "+obj.b);
        System.out.println("c = "+Types.c);
    }    
}
