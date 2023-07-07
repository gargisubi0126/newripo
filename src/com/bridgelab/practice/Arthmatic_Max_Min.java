package com.bridgelab.practice;

//import java.util.Scanner;

public class Arthmatic_Max_Min 
{
	 public static void main(String[] args) {
//	        Scanner scanner = new Scanner(System.in);
//	        
//	        System.out.print("Enter the first number: ");
//	        int a = scanner.nextInt();
//	        
//	        System.out.print("Enter the second number: ");
//	        int b = scanner.nextInt();
//	        
//	        System.out.print("Enter the third number: ");
//	        int c = scanner.nextInt();
	        
		 int a=10,b=20,c=30;
	        // a + b * c
	        int result1 = a + b * c;
	        System.out.println("Result of a + b * c: " + result1);
	        
	        // c + a / b
	        int result2 = c + a / b;
	        System.out.println("Result of c + a / b: " + result2);
	        
	        // a % b + c
	        int result3 = a % b + c;
	        System.out.println("Result of a % b + c: " + result3);
	        
	        // a * b + c
	        int result4 = a * b + c;
	        System.out.println("Result of a * b + c: " + result4);
	        
	        // Find the maximum value
	        int max = Math.max(Math.max(result1, result2), Math.max(result3, result4));
	        System.out.println("Maximum value: " + max);
	        
	        // Find the minimum value
	        int min = Math.min(Math.min(result1, result2), Math.min(result3, result4));
	        System.out.println("Minimum value: " + min);
	    }
	
	
}
