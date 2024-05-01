interface customerRaj   
{
    int amount = 5;  // public + static + final
    void purches();  // public + abstract
}
class SallerSanju implements customerRaj
{

    public void purches()
    {
        System.out.println("Aman needs "+amount+" kg of rice");
    }
}
class Check
{
    public static void main(String[] args) 
    {
        customerRaj obj = new SallerSanju();
        obj.purches();

    }
}
