package testpackage;

import testpackdemo.*;

public class TestDemo {

    public static void main(String[] args) {
        System.out.println("test run");
        //object
        // baseclass objectname = new referenceclass()
        TestDemo testdome = new TestDemo();
        testdome.addition();
        testdome.arithmeticoperations(2, 3);
        testdome.arithmeticoperations(5, 6);
        System.out.println(testdome.multiplicationDemo(2,3));
        TestDemoSample testdemosample = new TestDemoSample();
        testdemosample.subtraction();

        TestDemo testdemoobj = new TestDemo();
        System.out.println(testdemoobj.multiplicationDemo(2,3));

    }

    //method with out argument
    public void addition(){
        int a =1;
        int b =2;
        int result = a+b;
        System.out.println("the data available : " +result);
    }

    //method with argument
    public void arithmeticoperations(int a , int b ){
        int result = a +  b;
        System.out.println(result);
    }

    public int multiplicationDemo(int a , int b ){
        int result = a *  b;
        return result;
    }
}
