class A{
    public void sound(){
        System.out.println("A is shouting...");
    }
}

class B extends A{
    public void sound(){
        super.sound();
        System.out.println("B is shouting...");
    }
}

public class Super_1 {
    public static void main(String[] args) {
        B b=new B();

        b.sound();
    }
}
