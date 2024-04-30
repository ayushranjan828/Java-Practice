/*
    Instance block is similar to method which has no name. It can be written inside a class only but not inside a method.

    1) It always execute before the constructor.
    2) We can use variable only inside the instance block not method.
    3) We write time consuming code inside a instance block like - JDBC Connectivity.
*/
class A
{
    int a, b;
    A()
    {
        a = 300; b = 400;
        System.out.println(a+" "+b);
    }
    
    void Show()
    {
        a = 505; b = 404;
        System.out.println(a+" "+b);
    }

    {
        a = 333; b = 444;
        System.out.println(a+" "+b);
    }
}
class InstanceBlock
{
    public static void main(String[] args) 
    {
        A obj = new A();
        obj.Show();
    }
}