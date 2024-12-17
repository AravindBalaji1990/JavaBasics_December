package SamplePrograms.StringFunctions;

public class StringToChar {

    public static void main(String[] args) {
        String str = "sample";
        char[] ch = str.toCharArray();

        System.out.println("the string given : " + str);

//	       for(int i =0; i< ch.length;i++){
//	        System.out.println(ch[i]);
//	       }
        int left = 0;
        int right = ch.length - 1;
//	       
        for (left = 0; left < right; left++, right--) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
        }
        System.out.println(ch);
    }

}
