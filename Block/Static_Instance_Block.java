public class Static_Instance_Block 
{
    static // Ststic block
    {
        System.out.println("Ayush Piyush");
    }

    // Instance block
    {
        System.out.println("Ranjan");
    }
    public static void main(String[] args) 
    {
        // Instance block cannot be printed without object
        Static_Instance_Block obj = new Static_Instance_Block();
    } 
}
