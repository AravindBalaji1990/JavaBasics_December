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
            in = new FileReader(System.getProperty("user.dir") + "/src/test/resources/data/SampleInput.txt");
            out = new FileWriter(System.getProperty("user.dir") + "/src/test/resources/output_write.txt");

            int c;
            while ((c = in.read()) != -1) {
                System.out.println("the charcter data :" + (char) c);
                out.write(c);
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
