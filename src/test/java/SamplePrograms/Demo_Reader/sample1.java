package SamplePrograms.Demo_Reader;

import java.util.Scanner;

public class sample1 {

	public static void main(String[] args) {
		   Scanner scn=new Scanner(System.in);
		   int n=scn.nextInt();
		   for(int i=1;i<=n;i++)
		   {
		    for(int j=1;j<=n;j++)
		     
		    {
		     if((i+j)>n)
		     {
		     System.out.print("#");
		     }
		     else
		     {
		      System.out.print(" ");
		     }
		     
		    }
		    System.out.println();
		    
		   }
	}

}
