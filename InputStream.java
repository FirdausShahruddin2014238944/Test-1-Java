import java.io.FileInputStream;
//import java.io.OutputStream;
import java.io.IOException;

public class InputStream {
    public static void main(String args[]) {
    	
    
     
        	try (FileInputStream fis = new FileInputStream("FirdausShahruddin-a1.txt")) {
          int data = fis.read();
            while (data != -1) {
                System.out.print(Integer.toBinaryString(data));
                data = fis.read();
            }
        } catch (IOException e) {
            System.out.println("Failed to read binary data from File");
            e.printStackTrace();



        }
    }
}


