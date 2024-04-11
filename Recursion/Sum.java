class Sum
{
    int add(int n)
    {
        if(n > 0)
        {
            return n + add(n-1);
        }
        else
        {
            return 0;
        }
    }
    public static void main(String[] args) 
    {
        Sum obj = new Sum();
        int result = obj.add(5);
        System.out.println("Sum of n natural number: "+result);
    }
}
