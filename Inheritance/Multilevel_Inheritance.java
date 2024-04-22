/*
    In multilevel inheritancen we have only one super class and multiple sub classes called multilevel Inheritance.
*/
class AA
{
    int a, b, c;
    void add()
    {
        a = 10;
        b = 20;
        c = a+b;
        System.out.println("Sum of two number: "+c);
    }
    void sub()
    {
        a = 10;
        b = 20;
        c = a-b;
        System.out.println("Subtraction of two number: "+c);
    }
}

class BB extends AA
{
    void multi()
    {
        a = 10;
        b = 20;
        c = a * b;
        System.out.println("Multiplication of two number: "+c);

    }
    void divide()
    {
        a = 10;
        b = 20;
        c = a / b;
        System.out.println("Division of two number: "+c);

    }
}

class CC extends BB
{
    void rem()
    {
        a = 10;
        b = 20;
        c = a % b;
        System.out.println("Remainder of two number: "+c);
    }
}

public class Multilevel_Inheritance 
{
    public static void main(String[] args)
    {
        CC obj = new CC();
        obj.add();
        obj.sub();
        obj.multi();
        obj.divide();
        obj.rem();
        System.out.println("------------------------");
        AA obj1 = new AA();
        obj1.add();
    }
}
