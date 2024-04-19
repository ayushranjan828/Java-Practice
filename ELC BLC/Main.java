/*
    BLC:- If we have a class but inside a class we don't have main method then that class is called Business Logic Class.

    ELC:- If we write the main method inside a class then the class is called executable logic class.
*/

public class Main 
{
    public static void main(String[] args)
    {
        amazon obj1 = new amazon();
        obj1.input();
        obj1.show();

        flipkart obj2 = new flipkart();
        obj2.input();
        obj2.show();
    }    
}
