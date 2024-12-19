package collecitonsdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
//        Set<String> hashsetobj = new HashSet<>();
        HashSet<String> hashsetobj = new HashSet<>();
        hashsetobj.add("Sample1");
        hashsetobj.add("Sample2");
        hashsetobj.add("Sample3");
        hashsetobj.add("Sample4");
        hashsetobj.add("Sample5");
        hashsetobj.add("Sample5");
        hashsetobj.add("Sample1");

        for (String data : hashsetobj) {
            System.out.println("items inside the hashset: " + data);
        }

        Iterator<String> iteratordata = hashsetobj.iterator();
        //hasNext -> true/false based onthe data availablability onthe list
        // if true goes inside the loop
        while (iteratordata.hasNext()) {
            // next() -> this gets the data
            System.out.println("loop through element using iterator : " + iteratordata.next());
        }


    }
}
