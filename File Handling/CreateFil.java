import java.io.File;
import java.io.IOException;
class CreateFile
{
    public static void main(String[] args) 
    {
        File obj = new File("E:/Assingment/Java/File Handling/abc.txt");
        
        try
        {
            if(obj.createNewFile())
            {
                System.out.println("File "+obj.getName()+" is create successfully");
            }
            else
            {
                System.out.println("File already exist");
            }
        }
        catch(IOException i)
        {
            System.out.println("Exception Handled");
        }
    }
}
