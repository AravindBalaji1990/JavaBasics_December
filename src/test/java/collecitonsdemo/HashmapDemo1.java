package collecitonsdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashmapDemo1 {
    public static void main(String[] args) {
//        Map<Integer, String> mapobj = new HashMap<>();
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
        mapobj.put(null, null);
        mapobj.put(106, null);

//        mapobj.remove(100); // remove a entry from the hashmap
//        mapobj.remove(100,"Sample1"); // remove a entry from the hashmap with key and value
        mapobj.put(100,"Sample100"); // update/modify the value inside the hashmap
//        mapobj.clear(); // all the items inside the hashmap will be cleared

        for (Map.Entry data : mapobj.entrySet()) {
            System.out.println("data inside a hashmap : " + data.getKey() + " - " + data.getValue());
        }
    }
}
