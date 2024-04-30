class AA
{
    int a, b;
    static void Show()
    {
        System.out.println("Ayush Ranjan");
    }

    AA()
    {
        a = 300; b = 400;
        System.out.println(a+" "+b);
    }

    {
        a = 333; b = 444;
        System.out.println(a+" "+b);
    }
}
public class InstanceBlock_1 
{
    public static void main(String[] args) 
    {
        AA.Show();
        AA obj = new AA();
        AA.Show();
    }
}
