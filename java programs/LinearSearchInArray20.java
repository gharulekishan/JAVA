package java_programms;

public class LinearSearchInArray20 {

	public static void main(String[] args) {

    int a []= {20,65,98,32,54,67,21};
    
    int search_element =54;
    
    boolean flag=false;
    for (int i =0; i<a.length;i++)
    	
    {
    	
    	if (search_element==a[i])
    	{
    		
    		System.out.println("Element found at index  "+ i);
    		flag=true;
    		break;
    		
    	}
    		
    	
    }
		
		
		if(flag==false)
		{
			
			System.out.println("Element is not found in the array");
		}
		
		

	}

}
