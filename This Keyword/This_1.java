public class This_1 
{
    int a;
    This_1(int a)
    {
        this.a = a;
    }
    void show()
    {
        System.out.println(a);
    }
    public static void main(String[] args) 
    {
        This_1 obj = new This_1(100);

        obj.show();
    }
}
