abstract class Programming
{
    public abstract void Developer();
}
class HTML extends Programming
{
    public void Developer()
    {
        System.out.println("Tim Berners Lee");
    }
}
class Java extends Programming
{
    public void Developer()
    {
        System.out.println("James Gosling");
    }
}
 
class Main
{
    public static void main(String[] args) 
    {
        HTML obj_html = new HTML();    
        obj_html.Developer();

        Java obj_Java = new Java();
        obj_Java.Developer();
    }
}
