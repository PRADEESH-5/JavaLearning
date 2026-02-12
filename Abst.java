abstract class Sound{
    public abstract void animalSound();
    public void sleep() {
        System.out.println("Zzz");
    }
}


class Sound_1 extends Sound{
    public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

public class Abst {
    public static void main(String[] args) {
    Sound_1 s = new Sound_1(); 
    s.animalSound();
    s.sleep();
  }
}
