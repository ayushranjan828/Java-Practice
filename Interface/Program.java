//import java.util.*;
class MAIN<T extends Number>{
    T data;
    MAIN(T data){
        this.data=data;
    }
    public void display(){
        System.out.println(this.data);

    }
}
public class Program{
    public static void main(String[] args){
        MAIN<Integer> l=new MAIN<>(10);
        l.display();
        MAIN<Float> l2=new MAIN<>(10.2f);
        l2.display();
    }
}