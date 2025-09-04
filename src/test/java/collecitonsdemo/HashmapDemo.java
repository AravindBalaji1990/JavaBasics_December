package collecitonsdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashmapDemo {
    public static void main(String[] args) {
        Map<Integer, String> mapobj1 = new HashMap<>();
        HashMap<Integer, String> mapobj = new HashMap<>();

        // to add items inisde a hashmap
        mapobj.put(100, "Sample1");
//        mapobj.put(100,"Sample100");
        mapobj.put(101, "Sample2");
        mapobj.put(102, "Sample3");
        mapobj.put(103, "Sample4");
        mapobj.put(104, "Sample5");
        mapobj.put(105, "Sample6");
        mapobj.put(107, "Sample6");
        mapobj.put(null, "nulll");
        mapobj.put(null, null);
        mapobj.put(106, null);

        System.out.println("the value of the particular key : " + mapobj.get(101));
        for (Map.Entry data : mapobj.entrySet()) {
            System.out.println("data inside a hashmap : " + data.getKey() + " - " + data.getValue());
        }

        // loop throught he values
//        for (String value : mapobj.values()) {
//            System.out.println("values inside a hashmap  : " + value);
//        }

        //loop through the key
//        for (Integer key : mapobj.keySet()) {
//            System.out.println("values inside a hashmap  : " + key);
//        }

//        Iterator<Map.Entry<Integer, String>> iteratordata = mapobj.entrySet().iterator();
        //hasNext -> true/false based onthe data availablability onthe list
        // if true goes inside the loop
//        while (iteratordata.hasNext()) {
//             next() -> this gets the data
//            Map.Entry<Integer, String> entry = iteratordata.next();
//            System.out.println("loop through element using iterator : " + entry.getValue() + " = " + entry.getKey());
//        }


    }
}
