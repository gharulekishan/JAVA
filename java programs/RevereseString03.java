package java_programms;

import java.util.Scanner;

public class RevereseString03 {

	public static void main(String[] args) {

     Scanner sc= new Scanner(System.in);
     
     System.out.println("Enter a new String");
     
     String str = sc.nextLine();
		
	 String rev = "";
	 
	 int len = str.length();
	 
	 for (int i=len-1;i>=0;i--)
	 {
		 
		rev= rev + str.charAt(i); 
		  
	 }
		
		
	 System.out.println("reverse string :   "+rev);
		
		
	}

}
