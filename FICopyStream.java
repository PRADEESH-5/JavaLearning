import java.io.*;
import java.io.IOException;

public class FICopyStream {
    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream("C:/Users/enoch/Downloads/beautiful-scenery-summit-mount-everest-covered-with-snow-white-clouds.jpg");
         FileOutputStream output = new FileOutputStream("copy.png")) {
            int i;
            while ((i = input.read()) != -1) {
            output.write(i);  // write the raw byte to the new file
        }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error handling file.");
        }
    }
}