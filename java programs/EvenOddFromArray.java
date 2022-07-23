package java_programms;

public class EvenOddFromArray {

	public static void main(String[] args) {
	
		int a []= {1,2,3,4,5,6,7,8,9,10};
		
		
		
		System.out.println("Even Number From Array");
		
		for (int value : a)
		{
			
			if (value % 2==0)
			System.out.println(value);
			
		}
		
		
		System.out.println("Odd Number From Array");
		
		for (int value : a)
		{
			
			if (value % 2!=0)
			System.out.println(value);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
