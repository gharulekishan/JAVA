package java_programms;

import java.util.Scanner;

public class palindromeString05 {

	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("enter a name");
    String name = sc.nextLine();
  
    String rev="";
    
    
    int len= name.length();
    
    for(int i=len-1;i>=0;i--)
    	
    {
      rev = rev + name.charAt(i);
    	
    }
		
	if (name.equals(rev))	
		
	{
		
		
		System.out.println(name +" is a palindrome string");
		
	}	
		
		
	else
	{
		
		
		System.out.println(name +" is a not palindrome string");

		
	}	
			

	}

}
