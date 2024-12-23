package exceptionhandling;

import java.io.IOException;

public class ExceptionHandlingDemo3 {
    public static void main(String[] args) {
        try {
            int result = 2 / 2;
            if(result == 1) {
                System.out.println("the output : " + result);
                throw new ArrayIndexOutOfBoundsException("this is just a exception");
            }

            String[] arraystring = {"sample", "demo", "except"};
            System.out.println("the data in array :" + arraystring[3]);
        }
        catch (Exception e) {
            System.out.println("the  sepcific exception : " + e);
            e.printStackTrace();
        } finally {
            System.out.println("this is a finally block");
        }
    }
}
