class P
{
    int x;
    String y;
    P(int a, String s)
    {
        x = a;
        y = s;
    }
    P(int a, int b)
    {
        System.out.println(a+" "+b);
    }
    void Show()
    {
        System.out.println(x+" "+y);
    }
}
public class ParameterizedConstructor 
{
    public static void main(String[] args)
    {
        P obj = new P(11, "Unnati");
        P obj1 = new P(999, 10101);
        obj.Show();
    }    
}
