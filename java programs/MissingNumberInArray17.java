package java_programms;

public class MissingNumberInArray17 {

	public static void main(String[] args) {

 int a []= {1,2,3,4,5,7,8,9,10};
 
 int sum_array =0;
 int sum_range=0;
 
 
 for (int sum : a )
 {
	 
	 sum_array = sum_array + sum;
	 
 }
		
		
	for (int i=0; i<=10;i++)
	{
		sum_range = sum_range +i;
		
	}
		
	System.out.println("Missing number in a array is :   " + (sum_range-sum_array));	
		
		
		
		
		
		
		
	}

}
