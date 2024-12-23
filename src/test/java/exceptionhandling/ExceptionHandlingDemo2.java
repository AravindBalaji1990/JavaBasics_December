package exceptionhandling;

public class ExceptionHandlingDemo2 {
    public static void main(String[] args) {
        try {
            int result = 2 / 2;
            System.out.println("the output : " + result);

            String[] arraystring = {"sample", "demo", "except"};
            System.out.println("the data in array :" + arraystring[3]);
        }
//        catch (ArithmeticException e) {
//            System.out.println("the  sepcific exception : " + e);
//            e.printStackTrace();
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("the  sepcific exception : " + e);
//            e.printStackTrace();
//        }
        catch (Exception e) {
            System.out.println("the  sepcific exception : " + e);
            e.printStackTrace();
        } finally {
            System.out.println("this is a finally block");
        }
    }
}
