package collecitonsdemo;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.Random;

public class LinkedListDemo {

    public static void main(String[] args) {
//        List<String> stringarraylist = new LinkedList<>();
//        LinkedList<Object> name = new LinkedList();
//        name.add("sample");
//        name.add(1);
//        System.out.println("the total items inside the list :" +name.size());

        LinkedList<String> stringarraylist = new LinkedList<>();
        // add data to arraylist
        stringarraylist.add("sample1"); //0
        stringarraylist.add("sample2"); //1
        stringarraylist.add("sample3");
        stringarraylist.add("sample4");
        stringarraylist.add("sample5");
        stringarraylist.add("sample1");
        stringarraylist.add("");
        stringarraylist.add(null);

        System.out.println("the total items inside the list :" + stringarraylist.size());
        System.out.println("get one of the data from array :" + stringarraylist.get(1));
        System.out.println("get one of the data from array :" + stringarraylist.remove(2));// remove theelement from the list



        System.out.println("get one of the data from array usign random:" + stringarraylist.get(new Random().nextInt(stringarraylist.size())));

        // manipulate the data
        for (int i = 0; i < stringarraylist.size(); i++) {
            System.out.println("data manipulation : " +stringarraylist.get(i));
        }

        System.out.println("---------------------");

        for(String data : stringarraylist){
            System.out.println("data manipulation : " +data);
        }

        System.out.println("---------------------");

        Iterator<String> iteratordata = stringarraylist.iterator();
        //hasNext -> true/false based onthe data availablability onthe list
        // if true goes inside the loop
        while(iteratordata.hasNext()){
            // next() -> this gets the data
            System.out.println(iteratordata.next());
        }

        stringarraylist.clear();// this will clear the entire list


    }
}
