package collecitonsdemo;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableDemo1 {

    public static void main(String[] args) {
//        Dictionary<Integer,String> hashtabledemo = new Hashtable<>();
        Hashtable<Integer, String> hashtabledemo = new Hashtable<>();

        hashtabledemo.put(100, "Sample1");
//        hashtabledemo.put(100,"Sample100");
        hashtabledemo.put(101, "Sample2");
        hashtabledemo.put(102, "Sample3");
        hashtabledemo.put(103, "Sample4");
        hashtabledemo.put(104, "Sample5");
        hashtabledemo.put(105, "Sample6");
        hashtabledemo.put(107, "Sample6");
        // null key or value is not accepted in the HashTable
//        hashtabledemo.put(null, null);
//        hashtabledemo.put(106, null);

        hashtabledemo.remove(100); // remove a entry from the hashmap
//        hashtabledemo.remove(100,"Sample1"); // remove a entry from the hashmap with key and value
//        hashtabledemo.put(100,"Sample100"); // update/modify the value inside the hashmap
//        hashtabledemo.clear(); // all the items inside the hashmap will be cleared

        for (Map.Entry data : hashtabledemo.entrySet()) {
            System.out.println("data inside a hashmap : " + data.getKey() + " - " + data.getValue());
        }
    }
}
