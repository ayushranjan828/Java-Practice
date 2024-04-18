class CO
{
    int a; double b; String c;
    CO()
    {
        a = 100;
        b = 7.9;
        c = "Piyush Ranjan";
    }
    CO(int x)
    {
        a = x;
    }
    CO(double y, String z)
    {
        b = y;
        c = z;
    }
}
public class ConstructorOverloading 
{
    public static void main(String[] args) 
    {
        CO obj1 = new CO();    
        CO obj2 = new CO(66);    
        CO obj3 = new CO(23.69, "Ayush");    

        System.out.println(obj1.a+" "+obj1.b+" "+obj1.c);
        System.out.println(obj2.a);
        System.out.println(obj3.b+" "+obj3.c);
    }
}
