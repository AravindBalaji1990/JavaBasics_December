package multipleinhertiance;

public class DemoClass1 implements InterfaceDemo, InterfaceDemo2 {
    @Override
    public void demoMethod1() {
        System.out.println("this is from DemoClass1 and method demoMethod1");
    }

    @Override
    public void demoMethod2() {
        System.out.println("this is from DemoClass1 and method demoMethod2");
    }

    public void demoMethod3() {
        System.out.println("this is from DemoClass1 and method demoMethod3");
    }

    @Override
    public void artihmeticOperation() {
        int a = 1;
        int b = 2;
        int result = a + b;
        System.out.println("the result of arithmetic operation : " + result);
    }

    @Override
    public String printStringData() {
        return "Sample string";
    }

    public static void main(String[] args) {
        DemoClass1 democlass1 = new DemoClass1();
        democlass1.artihmeticOperation();
        // this is how we call the method with implementation
        // using the same object
        democlass1.sampleMethod();

        DemoClass2 democlass2 = new DemoClass2();
        democlass2.artihmeticOperation();
    }
}
