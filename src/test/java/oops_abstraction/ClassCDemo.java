package oops_abstraction;

public class ClassCDemo extends AbstractDemoClass1 {
    @Override
    void demoMethod1() {
        int result = 4 * 7;
        System.out.println("the result of operation :" + result);
    }

    @Override
    int demoMethod2() {
        return 2000;
    }

    public static void main(String[] args) {
        //overrriding - only at the runtime it will idenoty which methods implementation is available
        AbstractDemoClass1 obj = new ClassCDemo();
        obj.demoMethod1();
        System.out.println(obj.demoMethod2());
        obj.sampleMethod1();

        AbstractDemoClass1 obj1 = new ClassBDemo();
        obj1.demoMethod1();
        System.out.println(obj1.demoMethod2());
        obj1.sampleMethod1();
    }
}
