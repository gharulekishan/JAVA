package java_programms;

import java.util.Scanner;

public class SwapToNumbers01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number1 ");
		int a = sc.nextInt();
		System.err.println("Enter number 2");
		int b = sc.nextInt();
		
		
		int c=a;
		
		    a=b;
		    
		    b=c;
		
	
	    System.out.println("values of a and b after swapping: "  + a +"  " +b  );
	}
}
