package constructordemo;

public class ConstructorDemoWithParameter {
    static int a = 0;
    static int b = 0;

    // empty constructor with no parameters
    // constructors with parameter
    public ConstructorDemoWithParameter(int a , int b) {
        System.out.println("i am inside constructor");
//        a= 10;
        // this - is a keyword avialable in java to point to the variable at that instance at that point
        a = a;
//        b =10;
        b = b;
    }

    public void additionDemo(int a, int b) {
        int result = a + b;
        System.out.println("the result of addition :" + result);
    }


    public static void main(String[] args) {
        ConstructorDemoWithParameter constrcutordemo = new ConstructorDemoWithParameter(a, b);
        constrcutordemo.additionDemo(a, b);
        ConstructorDemoWithParameter constrcutordemo1 = new ConstructorDemoWithParameter(19, 1);
        constrcutordemo1.additionDemo(a,b);

    }
}
