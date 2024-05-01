class A
{
    void Show()
    {
        System.out.println("Super Class");
    }
}
class B extends A
{
    @Override
    void Show()
    {
        System.out.println("Sub Class");
    }
}

class Overriden
{
    public static void main(String[] args) 
    {
        B obj = new B();
        obj.Show();    
    }
}
