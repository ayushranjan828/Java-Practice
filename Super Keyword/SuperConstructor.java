class AA  // Super Class
{
    AA()
    {
        System.out.println("Hello World of class A");
    }
}
class BB extends AA  // Sub Class
{
    BB()
    {
        // by-default Super keyword is used
        System.out.println("Hello World of class B");
    }
}
public class SuperConstructor 
{
    public static void main(String[] args) 
    {
        BB obj = new BB();
    }
}
