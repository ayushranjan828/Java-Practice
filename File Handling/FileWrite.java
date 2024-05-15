import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
class FileWrite 
{
    public static void main(String[] args) 
    {
        try
        {
            FileWriter obj = new FileWriter("E:\\Assingment\\Java\\File Handling\\abc.txt");
            
            try
            {
                obj.write("Java is best language ever");
            }
            finally
            {
                obj.close();
            }
            System.out.println("Successfully data is wroten");
        }
        catch(IOException i)
        {
            System.out.println(i);
        }
    }
}
