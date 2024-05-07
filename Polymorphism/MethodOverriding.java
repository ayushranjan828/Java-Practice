class shape
{
    void draw()
    {
        System.out.println("Can't say shape Type");
    }
}
class square extends shape
{
    // We use @override to easily identify it is overriden method
    @Override
    void draw()
    {
        System.out.println("Square");
    }
}
class circle extends square
{
    void draw()
    {
        System.out.println("Circle");
    }
}
public class MethodOverriding 
{
    public static void main(String[] args) 
    {
        shape obj = new shape();
        obj.draw();

        square obj_1 = new square();
        obj_1.draw();
    }
}
