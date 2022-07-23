package java_programms;

import java.util.Arrays;

public class CheckArrayEquals16 {

	public static void main(String[] args) {

    int a []= {1,2,3,4,5,6,7,8,9,10};
    int b []= {1,2,3,4,5,6,7,8,9,10,11};
    
    boolean status= Arrays.equals(a,b);
    
    if (status==true)
    	
    {
    	System.out.println("Arrays are equals");
    	
    }
    
    else
    {
    	
    	System.out.println("Arrays are not equals");
    	
    }
		
		
		
		
		
		
		
		
		

	}

}
