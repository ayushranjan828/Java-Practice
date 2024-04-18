public class PrivateConstructorOverloading 
{
    int a; double b; String c;
    private PrivateConstructorOverloading()
    {
        a = 191;
        b = 71.9;
        c = "Piyush Ayush";
    }
    PrivateConstructorOverloading(int x)
    {
        a = x;
    }
    PrivateConstructorOverloading(double y, String z)
    {
        b = y;
        c = z;
    }   

    public static void main(String[] args) 
    {
        PrivateConstructorOverloading obj1 = new PrivateConstructorOverloading();    
        PrivateConstructorOverloading obj2 = new PrivateConstructorOverloading(66);    
        PrivateConstructorOverloading obj3 = new PrivateConstructorOverloading(23.69, "Ayush");    

        System.out.println(obj1.a+" "+obj1.b+" "+obj1.c);
        System.out.println(obj2.a);
        System.out.println(obj3.b+" "+obj3.c);
    }
}
