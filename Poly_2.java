class Vehicle{
    public void go(){}
}

class Bike extends Vehicle{
    @Override
    public void go(){
        System.out.println("Bike is going");
    }
}

class Mazhilunthi extends Vehicle{
    @Override
    public void go(){
        System.out.println("Mazhilunthi is going");
    }
}

class Boat extends Vehicle{
    @Override
    public void go(){
        System.out.println("Boat is going");
    }
}

public class Poly_2 {
    public static void main(String[] args) { 
        Vehicle v=new Vehicle();

        Bike b=new Bike();
        Mazhilunthi c=new Mazhilunthi();
        Boat b1=new Boat();

        v.go();
        b.go();
        c.go();
        b1.go();
        
    }
}
