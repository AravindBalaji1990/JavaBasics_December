package stringfunctionsdemo;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerDemo {

    public static void main(String[] args) {
        // split the string
        String data ="hello world welcome, to appium session";
        String[] datasplitted = data.split(",");
//        System.out.println(Arrays.toString(datasplitted));

        // in astring tokenizer - if no delimter is specified it takes space as a delimter
        StringTokenizer st = new StringTokenizer(data);

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        System.out.println("-----------------------");
        StringTokenizer st1 = new StringTokenizer(data, ",");

        while(st1.hasMoreTokens()){
            System.out.println(st1.nextToken());
        }
    }
}
