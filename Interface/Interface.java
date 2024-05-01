import java.util.Scanner;
interface client
{
    void input();   // public + abstract
    void output();    //public + abstract
}

class Interface implements client
{
    String name;
    double salary;

    public void input()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        name = sc.nextLine();

        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();

        sc.close();
    }
    public void output()
    {
        System.out.println(name+" "+salary);
    }

    public static void main(String[] args) 
    {
        client obj = new Interface();
        obj.input();
        obj.output();
    }
}