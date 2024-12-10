package arraysdemo;

import java.util.Arrays;
import java.util.Random;

public class ArryaDemoSession {

    public static void main(String[] args) {
        String[] datastring = {"abc","def","ghi","jkl","mno"};
        System.out.println(Arrays.toString(datastring));
        System.out.println(datastring.length);
        System.out.println(datastring[1]);
        System.out.println(datastring[ new Random().nextInt(datastring.length)]);

        Integer [] intarray = new Integer[5];
        intarray[0] = 1;
        intarray[1] = 2;
        intarray[2] = 3;
        intarray[3] = 4;
        intarray[4] = 5;
//        intarray[5] = 6;
        System.out.println(Arrays.toString(intarray));

        Object[] dataset = {1, "sample",3.14,true};
        System.out.println(dataset.length);
        System.out.println(dataset[2]);


    }
}
