import java.io.*;
import java.util.*;

public class FRead1 {
    public static void main(String[] args) {
        File myObj = new File("example.txt");

        try (Scanner myReader = new Scanner(myObj)) {
            while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }
    } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
    }
}