public class StringLiteral
{
    public static void main(String[] args)
    {
        String a = "Ayush";
        System.out.println(a);
        String b = "Ayush";
        System.out.println(b);

        a.concat("Ranjan");
        System.out.println(a);

        a = a.concat(" Ranjan");
        System.out.println(a);
    }
}