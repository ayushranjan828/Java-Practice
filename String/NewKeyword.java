public class NewKeyword 
{
    public static void main(String[] args) 
    {
        String a = new String("Ayush");
        System.out.println(a);

        String b = new String("Ayush");
        System.out.println(b);

        a.concat("Ranjan");
        System.out.println(a);

        a = "Piyush";
        System.out.println(a);

        a = a.concat(" Ranjan");
        System.out.println(a);
    }
}