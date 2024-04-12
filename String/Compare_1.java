public class Compare_1 
{
    public static void main(String[] args)
    {
        // String Literal
        String a = "Lion";
        String b = "Lion";

        if(a.equals(b))
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
        
        if(c.equals(d))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }

        String e = new String("Cat");
        String f = new String("Tiger");
        
        if(e.equals(f))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }

        String g = new String("Tiger");
        String h = new String("Tiger");
        
        if(g.equals(h))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }    
}
