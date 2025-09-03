package oops_abstraction;

public class ClassBDemo extends AbstractDemoClass1 {

    @Override
    void demoMethod1() {
        int result = 1 + 4;
        System.out.println("the result of the opretiaon : " + result);
    }

    @Override
    int demoMethod2() {
        return 100;
    }
}
