/*
    Whenever a class contain more than one method with same name and different type of parameter called overloading.
*/
class A
{
    void add()
    {
        int a=10, b=20, c;
        c = a+b;
        System.out.println(c);
    }
    void add(int x, int y)
    {
        int c;
        c = x + y;
        System.out.println(c);
    }
    void add(int x, double y)
    {
        double c = x + y;
        System.out.println(c);
    }
}
class MethodOverloading
{
    public static void main(String[] args) 
    {
        A obj = new A();
        obj.add();
        obj.add(5, 6);
        obj.add(5, 6.6);
    }
}