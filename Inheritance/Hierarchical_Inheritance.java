/*
    A inheritance which contain only one super class and multiple sub class and all sub class directly extend super class called hierarchical inheritance.
 */
class A1
{
    void input()
    {
        System.out.println("Enter your name: ");
    }
}
class B1 extends A1
{
    void Show()
    {
        System.out.println("Ayush Ranjan");
    }
}
class C1 extends A1
{
    void display()
    {
        System.out.println("Piyush Ranjan");
    }
}
public class Hierarchical_Inheritance 
{
    public static void main(String[] args) 
    {
        B1 obj1 = new B1();    
        obj1.input();
        obj1.Show();
        System.out.println("------------------");
        C1 obj2 = new C1();
        obj2.input();
        obj2.display();
    }
}
