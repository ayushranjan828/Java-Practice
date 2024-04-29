class A
{
    private int value;  // Data hiding

    public void setValue(int x) // Data abstraction
    {
        value = x;
    }

    public int getValue()
    {
        return ++value;
    }
}
class Encapsulation 
{
    public static void main(String[] args) 
    {
        A obj = new A();
        obj.setValue(800);
        System.out.println(obj.getValue());
    }    
}
