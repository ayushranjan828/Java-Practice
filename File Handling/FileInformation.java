import java.io.File;
import java.io.IOException;
public class FileInformation 
{
    public static void main(String[] args) 
    {
        File obj = new File("E:/Assingment/Java/File Handling/abc.txt");

        
            if(obj.exists())
            {
                System.out.println("File Name: "+obj.getName());
                System.out.println("File Location: "+obj.getAbsolutePath());            
                System.out.println("File Writable: "+obj.canWrite());            
                System.out.println("File Readable: "+obj.canRead());            
                System.out.println("File Size: "+obj.length());            
                System.out.println("File Removed: "+obj.delete());            
            }
            else
            {
                System.out.println("File does not exist");
            }    
        
    }    
}
