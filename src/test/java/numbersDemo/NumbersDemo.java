package numbersDemo;

public class NumbersDemo {
    public static void main(String[] args) {
        float flo = 1.1224324f;
        double dou = 1.12312432434535;
        System.out.println("the float value :  "+ flo);
        System.out.println("the double value :  "+ dou);

        Object num = "2";
        Object bool = true;
        Object data = 1;
        String number = "123";
        System.out.println("the integer : " +num);

        System.out.println(num instanceof Character);

        System.out.println(Integer.valueOf(number));// conversion of string to integer

    }
}
