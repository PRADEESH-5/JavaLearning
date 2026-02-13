import java.io.FileInputStream;  // Import FileInputStream
import java.io.IOException;

public class FIStream {
    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream("example.txt")) {
        int i;
        while ((i = input.read()) != -1) {
        System.out.print((char) i);
      }
    } catch (IOException e) {
      System.out.println("Error reading file.");
    }
    }
}