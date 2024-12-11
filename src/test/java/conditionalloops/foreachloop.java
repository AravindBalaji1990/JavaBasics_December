package conditionalloops;

public class foreachloop {
    public static void main(String[] args) {
        String[] stringarray = { "sample1", "sample2", "sample3" };
        // take the data from the variable and use it one by one with another  variable
        for (String data : stringarray) {
            System.out.println("the items inside the array : " + data);
        }
        System.out.println("------------------------");

    }
}
