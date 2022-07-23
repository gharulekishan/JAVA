package java_programms;

import java.util.Scanner;

public class Palindromenumber04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
	    int num= sc.nextInt();
	    int rev=0;
	    int org_num = num;
	    
		
  /*	StringBuffer sb = new StringBuffer (String.valueOf(num));
		StringBuffer rev= sb.reverse();
		System.out.println("reverse number " + rev);  */
		
        while(num!=0)
        {
        	 rev = rev*10 + num%10;
        	 num=num/10;
        	
        }
		
		 
		if(org_num==rev)
		{
			
			System.out.println(org_num +" is a palindrome number");
			
			
		}
		
		
		else
			
		{
			System.out.println(org_num +" is not  a palindrome number");
			
			
		}
		
		
		
		
		
		
	}

}
