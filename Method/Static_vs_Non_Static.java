public class Static_vs_Non_Static 
{
    int a = 7;
    static int b = 8;

    void Show1()
    {
        System.out.println("Show1 : "+a+" "+b);
    }

    static void Show2()
    {
        // a is non-static instance variable it cannot access through static variable
        // For accessing it you have to create object for variable b
        Static_vs_Non_Static obj = new Static_vs_Non_Static();

        System.out.println("Show2 : "+obj.a+" "+b);
    }
    public static void main(String[] args) 
    {
        Static_vs_Non_Static obj = new Static_vs_Non_Static();
        obj.Show1();

        Show2();
    }    
}
