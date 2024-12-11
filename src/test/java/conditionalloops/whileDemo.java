package conditionalloops;

public class whileDemo {

    public static void main(String[] args) {
        int i=6;
        // while loop will beexecuting till the contion is true
        System.out.println("before :"+i);
        while(i <= 5){
            System.out.println("the value is  : " +i);
            i++; // increment the varibale
        }
        System.out.println("condition is not satisfied");
    }
}
