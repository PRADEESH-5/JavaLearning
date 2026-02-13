import java.io.*;
public class FDelete1 {
    public static void main(String[] args) {
        File myObj = new File("test.txt");
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}