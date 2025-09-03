package oops_abstraction;

public abstract class AbstractDemoClass1 {

    //once the method is declared as abstract it cannot have a method body
    abstract void demoMethod1();

    abstract int demoMethod2();


    // how can i have a mehtod with body in abstraction
    public void sampleMethod1() {
        System.out.println("this is from method with body");
    }
}
