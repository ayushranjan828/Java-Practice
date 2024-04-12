public class Compare 
{
    public static void main(String[] args)
    {
        // String Literal
        String a = "Lion";
        String b = "Lion";

        if(a == b)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }

        // New keyword
        String c = "Cat";
        String d = new String("Cat");
        
        if(c == d)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
