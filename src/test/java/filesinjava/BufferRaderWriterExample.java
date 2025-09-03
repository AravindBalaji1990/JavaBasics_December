package filesinjava;

import java.io.*;

public class BufferRaderWriterExample {

    public static void main(String[] args) {
        try {

            //BufferedInputStream, BufferedOutputStream - FileInputStream, FileOutputStream
            BufferedReader br = new BufferedReader(new FileReader(
                    System.getProperty("user.dir") + "/src/test/resources/data/SampleInput.txt"), 1600);
            BufferedWriter bw = new BufferedWriter(new FileWriter(
                    System.getProperty("user.dir") + "/src/test/resources/data/SampleBufferOutput.txt"));
            int ch;
            while ((ch = br.read()) != -1) {
                if (Character.isLowerCase((char) ch))
                    bw.write(Character.toUpperCase((char) ch));
                else
                    bw.write((char) ch);
            }
            br.close();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}