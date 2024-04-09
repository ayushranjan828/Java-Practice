public class Method
{
    void fun_1()
    {
        System.out.println("fun_1");
    }

    static void fun_2()
    {
        System.out.println("fun_2");
    }

    static void fun_3()
    {
        System.out.println("fun_3");
    }
    public static void main(String[] args)
    {
        Method obj = new Method();
        obj.fun_1();  // Call through object

        fun_2();   // Static

        Method.fun_3();  // call through class
    }
}