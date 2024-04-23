class A1  // Super Class
{
    A1(int a)
    {
        System.out.println("Hello World of class A "+" "+"Value of a is "+a);
    }
}
class B1 extends A1  // Sub Class
{
    B1()
    {
        super(100);
        System.out.println("Hello World of class B");
    }
}
public class ParametrizedSuper 
{
    public static void main(String[] args) 
    {
        B1 obj = new B1();
    }
}
