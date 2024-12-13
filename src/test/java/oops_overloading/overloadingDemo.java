package oops_overloading;

public class overloadingDemo {

    public void arithmeticOperation(){
        int result = 9+8;
        System.out.println("result : " +result);

    }
    public void arithmeticOperation(int a , int b){

        int result = a*b;
        System.out.println("result : " +result);
    }
    public void arithmeticOperation(int a , int b, int c){
        int result = a*b*c;
        System.out.println("result : " +result);
    }

    public void arithmeticOperation(int a , int b, String c){
        int result = a*b;
        System.out.println(c +result);
    }

    public static void main(String[] args) {
        overloadingDemo overloadingdemo = new overloadingDemo();
        overloadingdemo.arithmeticOperation();
        overloadingdemo.arithmeticOperation(2,3);
        overloadingdemo.arithmeticOperation(2,3,4);
        overloadingdemo.arithmeticOperation(2,3,"the result: ");
    }
}
