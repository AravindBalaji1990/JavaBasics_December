package collecitonsdemo;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableDemo {

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

        for (Map.Entry data : hashtabledemo.entrySet()) {
            System.out.println("data inside a hashmap : " + data.getKey() + " - " + data.getValue());
        }

        // loop throught he values
        for (String value : hashtabledemo.values()) {
            System.out.println("values inside a hashmap  : " + value);
        }

        //loop through the key
        for (Integer key : hashtabledemo.keySet()) {
            System.out.println("values inside a hashmap  : " + key);
        }

        Iterator<Map.Entry<Integer, String>> iteratordata = hashtabledemo.entrySet().iterator();
        //hasNext -> true/false based onthe data availablability onthe list
        // if true goes inside the loop
        while (iteratordata.hasNext()) {
            // next() -> this gets the data
            Map.Entry<Integer, String> entry = iteratordata.next();
            System.out.println("loop through element using iterator : " + entry.getValue() + " = " + entry.getKey());
        }
    }
}
