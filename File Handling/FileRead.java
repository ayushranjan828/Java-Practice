import java.io.*;
public class FileRead 
{
    public static void main(String[] args) 
    {
        try
        {
            FileReader obj = new FileReader("E:\\Assingment\\Java\\File Handling\\abc.txt");
            
            try
            {
                int i;
                while((i = obj.read()) != -1)
                {
                    System.out.print((char)i);
                }
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
