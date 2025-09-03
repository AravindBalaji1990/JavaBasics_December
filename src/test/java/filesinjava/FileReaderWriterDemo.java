package filesinjava;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
    public static void main(String[] args) throws Exception {

        // initialising the values of FileReader and FileWriter
        FileReader in = null;
        FileWriter out = null;

        try {
            //System.getProperty("user.dir") - thsi will dynamically search for the folder where ever you have used
            in = new FileReader(System.getProperty("user.dir") + "/src/test/resources/data/SampleInput.txt");
            out = new FileWriter(System.getProperty("user.dir") + "/src/test/resources/output_write.txt");

            // this variable c will be a temp variable where when you write the bytes will be stored here
            int c;
            while ((c = in.read()) != -1) {
                System.out.println("the character data :" + (char) c);
                out.write(c);// this will write the data back to a txt file for any file that you provide as extensioni n line number 18
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println("Executed");
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println("Executed");
            }
        }

    }
}
