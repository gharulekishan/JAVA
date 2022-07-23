package java_programms;

public class MaxAndMInArrayElements18 {

	public static void main(String[] args) {


		int a []= {70,21,54,65,89,325,156,98};
		
		int max = a[0];
		
		for (int i =1; i< a.length; i++)
		{
			if (a[i] > max)
			{
				max= a[i];
				
			}
			
			
		}
		
		
		System.out.println("max element in the array is :  "+ max);
		
	
		
		
		int min = a[0];
		
		for (int i=1; i<a.length;i++)
		{
			
			if (a[i]<min)
			{
				
				min=a[i];
				
			}
			
			
		}
		
		System.out.println("Minimum nuber in the array is :  "+ min);
		
		
	}

}
