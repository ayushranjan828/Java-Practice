/*
    Simple inheritance nothing but which contain only one super class and only one sub class is called Simple Inheritance.
*/
class Student        // Super Class
{
    int roll, marks;
    String name;
    void input()
    {
        System.out.println("Entered roll name & marks: ");
    }
}
class SimpleInheritance extends Student        // Child Class
{
    void display()
    {
        roll = 12;
        marks = 64;
        name = "Ayush Ranjan";

        System.out.println(roll+" "+name+" "+marks);
    }
    public static void main(String[] args) 
    {
        SimpleInheritance obj = new SimpleInheritance();
        obj.input();
        obj.display();    
    }
}