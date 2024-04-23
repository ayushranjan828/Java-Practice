class A  // Super Class
{
    void Show()
    {
        System.out.println("Hello World of class A");
    }
}
class B extends A  // Sub Class
{
    void Show()
    {
        super.Show();
        System.out.println("Hello World of class B");
    }
}
class Super_1
{
    public static void main(String[] args) 
    {
        B obj = new B();
        obj.Show();
    }
}