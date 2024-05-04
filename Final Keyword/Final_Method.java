class Final
{
    void mNumber()
    {
        System.out.println("9122492377");
    }
    final void atmPIN()
    {
        System.out.println("9988");
    }
}
class Thief extends Final
{
    void mNumber()
    {
        System.out.println("9122492377");
    }

    //Using Final this method cannot be override
    /* 
    void atmPIN()
    {
        System.out.println("9988");
    }
    */
}
class Final_Method 
{
    public static void main(String[] args) 
    {
        Thief obj = new Thief();
        obj.mNumber();
        obj.atmPIN();
    }
}
