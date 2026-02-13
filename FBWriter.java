import java.io.*;
import java.nio.Buffer;

public class FBWriter {
    public static void main(String[] args) {
        try(BufferedWriter bw=new BufferedWriter(new FileWriter("example.txt",true))){
            bw.write("\nFirst line");
            bw.newLine();
            bw.write("Second line");
            System.out.println("Successfully wrote to the file.");
        }catch(IOException e){
            System.out.println("Error writing file.");
        }
    }
}