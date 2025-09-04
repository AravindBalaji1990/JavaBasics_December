package genericsdemo;

import multipleinhertiance.InterfaceDemo;

public class SampleMethodDemo {

    public static <T> void printData(T[] array){
        for(T element : array){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        String [] name ={"sample1","sample2","sample3"};
        Integer[] salary ={12345,67890,123244};

        printData(name);
        printData(salary);
    }
}
