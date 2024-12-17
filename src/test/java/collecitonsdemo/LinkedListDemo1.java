package collecitonsdemo;

import java.util.LinkedList;

public class LinkedListDemo1 {

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

        LinkedList<String> stringarraylist1 = new LinkedList<>();

        stringarraylist1.add("sample4");
        stringarraylist1.add("sample5");
        stringarraylist1.add("sample6");

// add two lists
//        stringarraylist.addAll(stringarraylist1);

        // delete items from list

//        stringarraylist.remove(1);

        // manipulate the data
        for (int i = 0; i < stringarraylist.size(); i++) {
            if(stringarraylist.get(i).equals("sample3")){
                stringarraylist.remove(i);
            }else {
                System.out.println("data manipulation : " + stringarraylist.get(i));
            }
        }


    }
}
