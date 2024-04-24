public class This_2
{
    This_2()
    {
        System.out.println("Hello World");
    }
    This_2(int a)
    {
        this();
        System.out.println(a);
    }
    public static void main(String[] args) 
    {
        This_2 obj = new This_2(100);
    }
}
