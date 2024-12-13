package oops_abstraction;

public class ClassADemo extends AbstractADemo{
    int methodA() {
        return 0;
    }

    @Override
    void methodB() {
        System.out.println("this is from classAdemo");
    }

    public static void main(String[] args) {
        AbstractADemo abstractademo = new ClassADemo();
        abstractademo.methodB();
        abstractademo.methodDisplay();
    }
}
