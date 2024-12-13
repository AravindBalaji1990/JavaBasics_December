package SamplePrograms.StringFunctions;

public class FrequencyOfCharInString_Repeatition {

	public static void main(String[] args) {
		String s="GooGoo";
//		char[] a = {'a','s'};
		
//		String name = new String (a);
//		System.out.println(name);
	    int sample = 0 ;

	    for (int i = 0; i < s.length(); i++) {

	        for (int j = 0; j < s.length(); j++) {

	            if(s.charAt(i)==s.charAt(j))
	            {
	               sample++;

	            }
	        }   
	        System.out.println(s.charAt(i)+"--"+sample);
	        String d=String.valueOf(s.charAt(i)).trim();
	        s=s.replaceAll(d,"");
	        sample= 0;

	    }

	}

}
