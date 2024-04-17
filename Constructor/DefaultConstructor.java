class D
{
    int a;
    String s = "Piyush";
    boolean b;
    D()
    {
        a = 101;
        s = "Ayush";
        b = true;
    }
    void Show()
    {
        System.out.println(a+" "+b+" "+s);
    }
}
class DefaultConstructor
{
    public static void main(String[] args) 
    {
        D obj = new D();
        obj.Show();    
    }
}
