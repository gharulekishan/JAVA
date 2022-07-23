package java_programms;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandom12 {

	public static void main(String[] args) {

		// approach 1
		Random ra = new Random();
		
		int random_int = ra.nextInt(10);
		System.out.println(random_int);
		
		double random_double = ra.nextDouble();
		System.out.println(random_double);
		
		// aproach 2
         System.out.println(Math.random());
         
         // Aproach 3
         
       String random_num=  RandomStringUtils.randomNumeric(4);
       String random_string = RandomStringUtils.randomAlphabetic(4);
       String random_alphaNumeric = RandomStringUtils.randomAlphanumeric(4);
       
       System.out.println(random_num);
       System.out.println(random_string);
       System.out.println(random_alphaNumeric);
       
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
