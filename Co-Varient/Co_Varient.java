class A
{
    A Show()
    {
        System.out.println("Super Child");
        return this;

        // return new A()
    }
}
class B extends A
{
    @Override
    B Show()
    {
        System.out.println("Sub Child");
        return this;
    }
}

class Co_Varient
{
    public static void main(String[] args) 
    {
        B obj = new B();
        obj.Show();    
    }
}
