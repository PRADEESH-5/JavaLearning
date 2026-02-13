import java.io.*;

public class FOStream {
    public static void main(String[] args) {
        String text="Coding is fun...!!😭😭";
        try(FileOutputStream ot=new FileOutputStream("example.txt")){
            ot.write(text.getBytes());
            System.out.println("Successfully wrote to file.");
        }catch(IOException e){
            System.out.println("Error writing file.");
            e.printStackTrace();
        }
    }
}