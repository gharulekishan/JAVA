package java_programms;

import java.util.Scanner;

public class FactorialNumber13 {

	public static void main(String[] args) {


		Scanner sc= new Scanner(System.in);
		System.out.println("Enter A Number");
		int num = sc.nextInt();
		long factorial =1;
		
		for (int i =1; i <=num; i++)
		{
			
			factorial = factorial * i;
			
		}
		
		
		System.out.println("factorial of a  number is:  "+ factorial);
		
		
		
		
	}

}
