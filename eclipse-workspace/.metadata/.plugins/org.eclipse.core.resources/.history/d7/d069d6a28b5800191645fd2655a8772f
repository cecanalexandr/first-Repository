package com.class17version2;
import java.util.Scanner;
public class Task6 {

	public static void main(String[] args) {
	
	     //Ask a user to input a leap year. Give the user 10 chances to enter a correct leap year.
		//As soon as the user enters the correct leap year exit the loop.
		// Leap year 
				
		 Scanner scan;
	        int year;
	        
	        scan=new Scanner(System.in);
	        
	        for (int i=0; i<10; i++) {
	            
	            System.out.println("Please enter a guessed leap year");
	            year=scan.nextInt();
	            
	            //if year is divisible by 400--> leap year
	            //if year is divisible by 100--> not a leap year
	            //if year is divisible by 4--> a leap year
	            //(year%400 == 0)|| (( year%4 == 0 ) &&( year%100 != 0)--> same thing
	            
	            if (year%400==0) {
	                System.out.println("Year is a leap year");
	                break;
	            }else if (year%4==0 && year%100!=0) {
	                System.out.println("Year is a leap year");
	                break;
	            }else {
	                System.out.println("Year is a NOT leap year");
	            }
	            
	        }
		
		
		
		
		
		
		
		
		
		
	}

}
