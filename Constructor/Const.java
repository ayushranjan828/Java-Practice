/*
    Constructor:- Constructor is a special type of method whose name is same as class name.

    1.  The main purpose of constructor is initialize the object.
    2.  Every java class has a constructor.
    3.  A constructor is autometically called at the time of object create.
    4.  A constructor never contain any return type including void. 
*/
class A
{
    int a; String name;
    A()
    {
        a = 0;
        name = "Ayush";
    }
    void Show()
    {
        System.out.println(a+" "+name);
    }
}

class Const
{
    public static void main(String[] args) 
    {
        A obj = new A();
        obj.Show();    
    }
}
