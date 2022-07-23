package java_programms;

import java.util.Scanner;

public class CountEvenAndOdd07 {

	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter A Number");
    
    int num = sc.nextInt();
    
    int even_count=0;
    int odd_count =0;
    
    while (num>0)
    {
    	int rem = num %10;
    	
    	if (rem%2==0)
    		
    	{
    		even_count ++;
    			
    	}
    	
    	else
    	{
    		
    		odd_count ++;
    		
    	}
    	
    	
    	num = num/10;
    	
    }
		
		System.out.println("number of even digits in a number :  "+even_count);
		System.out.println("number of even digits in a number :  "+odd_count);

	}

}
