import java.io.*;

public class FCreate1 {
    public static void main(String[] args) {
        try{
        File myObj = new File("example.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }
}