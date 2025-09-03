package constructordemo;

public class ConstructorDemo {
    static int a = 0;

    // empty constructor with no parameters
    // default constructors
    public ConstructorDemo() {
        System.out.println("i am inside constructor");
//        a = 10;
    }

    public void additionDemo(int a, int b) {
//        a = 2;
        int result = a + b;
        System.out.println("the result of addition :" + result);
    }


    public static void main(String[] args) {
        ConstructorDemo constrcutordemo = new ConstructorDemo();
        constrcutordemo.additionDemo(a, 3);
    }
}
