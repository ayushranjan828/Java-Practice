/*
    Var-args known as variable number of argument methods and it is new introduce in JDK 1.5V.

    By using this concept we can pass any no. of parameters including zero parameter to the calling method.
*/
class A
{
    void add(int ... a) // Var-args method
    {
        int sum = 0;
        for(int x:a)
        {
            sum = sum + x;
        }
        System.out.println("Sum of Number: "+sum);
    }
}
class VarArgs
{
    public static void main(String[] args) 
    {
        A obj = new A();
        obj.add();
        obj.add(10);
        obj.add(10, 20);
        obj.add(10, 20, 30);
    }
}
