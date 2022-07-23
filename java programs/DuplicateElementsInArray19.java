package java_programms;

public class DuplicateElementsInArray19 {

	public static void main(String[] args) {

    String a[] = {"Amardip","Sachin","Ram","Raju","Manoj","Rupesh","Amardip","Sachin"};
    
    boolean flag = false;
    
       for (int i =0; i<a.length;i++) 
    	   
       {
    	   
    	   for (int j=i+1;j<a.length;j++)
    		   
    	   {
    		   
    		   if(a[i]==a[j])
    		   {
    			   
    			   System.out.println("Found Duplicate Element In Array:  "+ a[i]);
    			   flag = true;
     
    		   }
    		   
    	   }
    	   
    	   
    	   
       }
		
		
		if (flag==false)
		{
			
			System.out.println("There Is No Duplicate Element");
			
		}
		
		
		
			

	}

}
