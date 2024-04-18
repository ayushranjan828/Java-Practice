/*
    In java, it is possible to write a constructor as a private but according to the rule we can't access private members outside of class.
    
    We cannot create object of private class into another class.
*/
class PrivateConstructor
{
    int a; double b; String c;
    private PrivateConstructor()
    {
        a = 10;
        b = 32.68;
        c = "Ayush Ranjan";
        System.out.println(a+" "+b+" "+c);
    }
    public static void main(String[] args) 
    {
        PrivateConstructor obj = new PrivateConstructor();    
    }
}
