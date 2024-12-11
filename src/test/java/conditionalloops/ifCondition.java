package conditionalloops;

public class ifCondition {
    public static void main(String[] args) {
        boolean a1 = true;

        boolean b1 = true;
        int z =1;

        if (a1 == true) {
            System.out.println("the value is true");
        } else if (b1 == true) {
            System.out.println("the value is true");
        } else {
            System.out.println("the value is false");
        }

        int a = 1;
        if (a == 3) {
            System.out.println("value is satisfied condition 1 ");
        } else if (a == 6) {
            System.out.println("value is satisfied condition 2");
        } else if (a == 0) {
            System.out.println("value is satisfied condition 3");
        } else if (a == 11) {
            System.out.println("value is satisfied condition 4");
        } else if (a == 8) {
            System.out.println("value is satisfied condition 4");
        } else {
            System.out.println("condition not satisfied ");
        }

        if(z==1){
            System.out.println("the donw  ");
        }
    }
}

