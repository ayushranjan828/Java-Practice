import java.io.File;
import java.io.IOException;

public class FileRename 
{
    public static void main(String[] args) 
    {
        File obj_1 = new File("E:/Assingment/Java/File Handling/abc.txt");
        File obj_2 = new File("E:/Assingment/Java/File Handling/Ayush.txt");
        
        if(obj_1.exists())
        {
            System.out.println(obj_1.renameTo(obj_2));
            System.out.println("File name Changed");
        }
        else
        {
            System.out.println("File name not changed");
        }
    }    
}
