abstract class Animals
{
    public abstract void sound();
}

class Dogs extends Animals
{
    public void sound()
    {
        System.out.println("Dog is Barking");
    }
}

class Lion extends Animals
{
    public void sound()
    {
        System.out.println("Lion is Roar");
    }
}

class abstract_class_1 
{
    public static void main(String[] args) 
    {
        Dogs obj_D = new Dogs();
        Lion obj_L = new Lion();

        obj_D.sound();
        obj_L.sound();
    }
}
