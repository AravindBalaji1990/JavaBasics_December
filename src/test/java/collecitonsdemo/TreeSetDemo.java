package collecitonsdemo;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet<String> treesetdemo = new TreeSet<>();
        treesetdemo.add("Sample5");
        treesetdemo.add("Sample3");
        treesetdemo.add("Sample1");
        treesetdemo.add("Sample2");
        treesetdemo.add("Sample4");


        for (String data : treesetdemo){
            System.out.println("items inside a treeset : " +data);
        }


        TreeSet<Integer> treesetdemo1 = new TreeSet<>();
        treesetdemo1.add(10);
        treesetdemo1.add(30);
        treesetdemo1.add(50);
        treesetdemo1.add(60);

        System.out.println("get the item from tree : " +treesetdemo1);
        System.out.println("the first : " + treesetdemo1.first());
        System.out.println("the last : " + treesetdemo1.last());
        System.out.println("the highest : " + treesetdemo1.higher(20));
        System.out.println("the lower : " + treesetdemo1.lower(20));
        System.out.println("the polling : " + treesetdemo1.pollFirst());
        System.out.println("the polling : " + treesetdemo1.pollLast());

    }
}
