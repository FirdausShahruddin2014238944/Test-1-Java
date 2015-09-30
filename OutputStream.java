
import java.io.FileReader;
import java.io.IOException;

public class OutputStream {
    public static void main(String args[]) {

       try (FileReader reader = new FileReader("FirdausShahruddin-a1 - Copy.txt")) {
            int character = reader.read();
            while (character != -1) {
                System.out.print((char) character);
               character = reader.read();
            }
        } catch (IOException io) {
            System.out.println("Failed to read character data from File");
           io.printStackTrace();
        }
    }
}


