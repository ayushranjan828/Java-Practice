interface customerRaj   
{
    int amount = 5;  // public + static + final
    void purches();  // public + abstract
}
class SallerSanju implements customerRaj
{

    public void purches()
    {
        //amount = 62;
        // We assing amount = 5 in interface it cannot be change
        System.out.println("Aman needs "+amount+" kg of rice");
    }
}
class Check_1
{
    public static void main(String[] args) 
    {
        customerRaj obj = new SallerSanju();
        obj.purches();

        // Static variable is directly called by interface or class name
        // It does not depend on object.

        System.out.println(customerRaj.amount); // amount is static
    }
}