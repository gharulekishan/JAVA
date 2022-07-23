package java_programms;

import java.util.Scanner;

public class FindLargestOf3Numbers09 {

	public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a First number");
  int a= sc.nextInt();
  
  
  System.out.println("Enter a second number");
  int b= sc.nextInt();
  
  
  
  System.out.println("Enter a third number");
		
  int c= sc.nextInt();
  
  
  if(a>b && a>c)
  {
	  System.out.println(a +   "   325is a largest a numbetr ");
	  
  }
  	
  else if (b>a && b>c)	
  {
	  
	  System.out.println(b +   "   is a largest a numbetr ");  
	  
  }
		
		
  else	
  {
	  
	  System.out.println(c +   "    is a largest a numbetr ");  
	  
  }	
		
		

	}

}
