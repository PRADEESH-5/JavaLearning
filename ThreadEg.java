public class ThreadEg extends Thread{
  public static int amount = 0;

  public static void main(String[] args) {
    ThreadEg t = new ThreadEg();
    t.start();
    System.out.println(amount);
    amount++;
    System.out.println(amount);
  }

  public void run() {
    amount++;
  }

}
