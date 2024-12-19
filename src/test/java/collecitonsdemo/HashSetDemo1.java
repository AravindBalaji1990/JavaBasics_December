package collecitonsdemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {
    public static void main(String[] args) {
//        Set<String> hashsetobj = new HashSet<>();
        HashSet<String> hashsetobj = new HashSet<>();
        hashsetobj.add("Sample1");
        hashsetobj.add("Sample2");
        hashsetobj.add("Sample3");
        hashsetobj.add("Sample4");
        hashsetobj.add("Sample5");

        hashsetobj.remove("Sample1"); // delete individual items inside a set
        hashsetobj.clear(); // clear the list/set entore items

        for (String data : hashsetobj) {
            System.out.println("items inside the hashset: " + data);
        }
    }
}
