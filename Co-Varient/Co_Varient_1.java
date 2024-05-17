/*
    Before the concept generally we can't change the return type of overriden method but new concept introduce in java called Co-Varient
    Where we can change the return type of of overriden method.
*/
class AA
{
    AA Show()
    {
        System.out.println("Super Child");
        return new AA();

        // return new A()
    }
}
class BB extends AA
{
    @Override
    BB Show()
    {
        super.Show();
        System.out.println("Sub Child");
        return new BB();
    }
}

class Co_Varient_1
{
    public static void main(String[] args) 
    {
        BB obj = new BB();
        obj.Show();    
    }
}