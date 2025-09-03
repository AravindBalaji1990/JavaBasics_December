package exceptionhandling;

public class ExceptionHandlingDemo4 {
    public static void main(String[] args)  {
        try {
            sampleMethod();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    public static void sampleMethod() throws ArithmeticException,Exception {

        int result = 2 / 2;
        if (result == 1) {
            System.out.println("the output : " + result);
        }

        String[] arraystring = {"sample", "demo", "except"};
        System.out.println("the data in array :" + arraystring[3]);


    }
}
