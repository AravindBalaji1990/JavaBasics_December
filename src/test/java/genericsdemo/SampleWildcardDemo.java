package genericsdemo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class SampleWildcardDemo {

    //wildcard - ?

    public static  void printList(List<?> list){
        for(Object obj : list){
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        List<String> name = Arrays.asList("sample1","sample2","sample3");
        List<Integer> datanum = Arrays.asList(123,456,789);

        printList(name);
        printList(datanum);
    }
}
