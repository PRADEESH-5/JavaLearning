import java.io.*;

public class FWrite1 {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("example.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();  // must close manually
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}