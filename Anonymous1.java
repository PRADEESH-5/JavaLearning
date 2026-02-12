interface Greeting {
  void sayHello();
}

public class Anonymous1 {

  public static void main(String[] args) {
    // Anonymous class that implements Greeting
    Greeting greet = new Greeting() {
      public void sayHello() {
        System.out.println("Hello, World!");
      }
    };

    greet.sayHello();
  }
}
