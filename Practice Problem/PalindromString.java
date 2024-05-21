import java.util.Scanner;
public class PalindromString
{    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        String temp = str;
        String rev = "";
        
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            rev = ch+rev;
        }
        System.out.println(rev);
        
        if(temp.equals(rev))
        {
            System.out.println("Palindrom number");
        }
        else
        {
            System.out.println("Not palindrom");
        }
    }
}    