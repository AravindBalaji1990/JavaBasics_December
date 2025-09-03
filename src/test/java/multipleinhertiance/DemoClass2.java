package multipleinhertiance;

public class DemoClass2 implements InterfaceDemo2 {

    @Override
    public void artihmeticOperation() {
        int a = 2;
        int b = 6;
        int result = a * b;
        System.out.println("the result of the arithmetic operation : " + result);

    }

    @Override
    public String printStringData() {
        return "this is from class DemoClass2";
    }
}
