import java.io.*;
import java.util.*;

public class FAppend {
    public static void main(String[] args) {
        String text="\nAppend text!!";

        try(FileOutputStream ot=new FileOutputStream("example.txt",true)){
            ot.write(text.getBytes());
            System.out.println("Successfully appended to file.");
        }catch(IOException e){
            System.out.println("Error writing file.");
            e.printStackTrace();
        }
    }
}