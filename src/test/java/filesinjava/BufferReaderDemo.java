package filesinjava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {

    public static void main(String[] args) throws IOException {
//        int buffersize = 8 * 1024;
        int buffersize = 1024;// 8kb
        BufferedReader bufferedReader = new BufferedReader
                (new FileReader(System.getProperty("user.dir") + "/src/test/resources/data/SampleInput.txt"), buffersize);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            //do something with line

            //line = bufferedReader.readLine();
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
