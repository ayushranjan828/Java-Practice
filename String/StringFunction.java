public class StringFunction 
{
    public static void main(String[] args) 
    {
        String a = "ANKIT";
        String b = "rahul";
        
        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());

        System.out.println(b.concat(a));
        System.out.println(b.length());

        String c = "     Ankush     ";
        System.out.println(c.trim());

        String d = "";
        System.out.println(d.isEmpty());

        String e = "     ";
        System.out.println(e.isEmpty());

        String f = "Ayush";
        System.out.println(f.charAt(2));
        System.out.println(f.indexOf("y"));

        String h = "Ranjan";
        System.out.println(h.replace("R", "T"));
    }    
}
