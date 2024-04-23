class A  // Super Class
{
    int a = 10;
}
class B extends A  // Sub Class
{
    int a = 20;
    void Show()
    {
        System.out.println(a);
        System.out.println(super.a);
    }
}
class Super
{
    public static void main(String[] args) 
    {
        B obj = new B();
        obj.Show();
    }
}
