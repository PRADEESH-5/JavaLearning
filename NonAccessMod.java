abstract class Vehicle{
    abstract void speed();
}

class Car1 extends Vehicle{

    void speed(){
        System.out.println("35KM/Hr");
    }
}


public class NonAccessMod {

    final int n=10;
    static int a=5;

    public static void main(String[] args) {
        Car1 c=new Car1();
        NonAccessMod n=new NonAccessMod();
        System.out.println(n.n);
        // n=44; error 
        System.out.println(a);
        c.speed();
    }
}
