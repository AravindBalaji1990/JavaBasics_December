package interfacedemo;

public class ClassADemo implements InterfaceADemo, InterfaceBDemo{
    @Override
    public void methodA() {
        System.out.println("this is a sample method");

    }

    @Override
    public String methodB() {
        return "sample";
    }

    @Override
    public int methodC() {
        return 0;
    }

    public static void main(String[] args) {
        ClassADemo classademo  = new ClassADemo();
        classademo.methodA();
        System.out.println(classademo.methodB());
        classademo.arithmeticOperation();
        classademo.arithmeticOperation();
        classademo.testDisplay();
    }


    @Override
    public void arithmeticOperation() {
        int a =2;
        int b =2;
        int result = a+b;
        System.out.println("the addition operation : " +result);
    }

    public String dataTest() {
        return null;
    }
}
