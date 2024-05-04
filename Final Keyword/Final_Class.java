final class Final_1
{
    void mNumber()
    {
        System.out.println("9122492377");
    }
    void atmPIN()
    {
        System.out.println("9988");
    }
}
class Thief_1 extends Final_1
{
    void mNumber()
    {
        System.out.println("9122492377");
    }
    
    void atmPIN()
    {
        System.out.println("9988");
    }
}
class Final_Class 
{
    public static void main(String[] args) 
    {
        Thief_1 obj = new Thief_1();
        obj.mNumber();
        obj.atmPIN();
    }
}
