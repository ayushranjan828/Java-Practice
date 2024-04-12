public class ReverseString 
{
    public static void main(String[] args) 
    {
        StringBuffer r1 = new StringBuffer("Learn Java");
        System.out.println(r1.reverse());  

        StringBuilder r2 = new StringBuilder("Ayush");
        System.out.println(r2.reverse());  
        
        String a = "Gurnoor";
        String b = "";
        int l = a.length();

        for(int i = l-1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        System.out.println(b);
    }    
}
