package arraysdemo;

public class multidimentionalarraydemo {

    public static void main(String[] args) {
        //                         0,00,1    1,01,1   2,02,1
        int[][] integerarray = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        // outerlopp will define the total array
        for (int i = 0; i<integerarray.length; i++) {

            // inner loop will get the items inside the outer loop
            for (int j = 0; j<integerarray[i].length; j++) {

                System.out.println("the values in the array : "+i +" , "+j +" --->" + integerarray[i][j]);
            }
        }

    }
}
