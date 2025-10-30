package testpackage;

import testpackdemo.TestDemoSample;

public class TestDemo1 {

    public static String name = "sample";
    public final static String fname = "first sample";
    public String lname = "last name sample";
    public static TestDemoSample TestDemoSampleobj;


    // public - access modifier - public , private and protected
    // static - a memory will be allocated till the execution is completed for the assigned mehotd or variable
    // void - return type of the mehtod - no return tyoe is required
    public static void main(String[] args) {
        // the below mehtod is static and we can call it directly
        PrintData();
        TestDemo1.PrintData();
        TestDemo1 testdemo1obj = new TestDemo1();
        // this static method will not be accessible fromthe auto suggested list but still can be used with object
        testdemo1obj.PrintData();

        // accessing the non static data
//        TestDemo1.PrintDataVariable();
        // we can use the same obbject declared withinthe method to access the non- static methods
        testdemo1obj.PrintDataVariable();
        main();
        testdemo1obj.addition(2, 3);
        testdemo1obj.addition(4, 3);
        System.out.println(testdemo1obj.multiply(3, 4));
        System.out.println(testdemo1obj.multiply(5, 4));

        TestDemoSampleobj = new TestDemoSample();
        TestDemoSampleobj.subtraction();
    }

    public static void main() {
        System.out.println("this is the second main method");
    }

    //method with retunr tyoe and with out return tyoe
    // method with argument and without argument

    public static void PrintData() {
        name = "sam";
        //any non static data we can access anywhere  within static or non-static using the objects
        TestDemo1 testdemo1obj = new TestDemo1();
        System.out.println("the global variable :  " + name + " the last anme :" + testdemo1obj.lname);
        System.out.println("the global variable firstname:  " + fname);
    }

    public void PrintDataVariable() {
        System.out.println("the global variable firstname:  " + fname);
    }

    // we will pass arguments to make it more egenric and accept any values
    public void addition(int a, int b) {
        int result = a + b;
        System.out.println("the addition operation : " + result);
    }

    public int multiply(int a, int b) {
        int result = a * b;
        return result;
    }

}
