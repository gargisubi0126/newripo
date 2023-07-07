package com.bridgelab.practice;

public class Arthmatic_operator 
{
public static void main(String[] args) 
{
	int a=10,b=20,c=30,res1,res2,res3,res4;
	
	res1 = a + b * c;
	res2 = c + a / b;
	res3 = a % b + c;
	res4 = a * b + c;
	
	
	 System.out.println("Result of a + b * c: " + res1);
	
	 System.out.println("Result of c + a / b: " + res2);
	 
	 System.out.println("Result of a % b + c: " + res3);
	 
	 System.out.println("Result of a * b + c: " + res4);
	 
	 
	 
	    if((res1>res2) && (res1>res3) && (res1>res4))
	        System.out.println("\nFirst number is largest" +res1);
	    else if((res2>res1) && (res2>res3) && (res2>res4))
	        System.out.println("\nSecond number is largest" +res2);
	    else if((res3>res2) && (res3>res1) && (res3>res4))
	        System.out.println("\nThird number is largest" +res3);
	    else if((res4>res2) && (res4>res3) && (res4>res1))
	    	System.out.println("\nFourth number is largest" +res4);

	    if((res1<res2) && (res1<res3) && (res1<res4))
	    	System.out.println("\nFirst number is smallest" +res1);
	    else if((res2<res1) && (res2<res3) && (res2<res4))
	    	System.out.println("\nSecond number is smallest" +res2);
	    else if((res3<res2) && (res3<res1) && (res3<res4))
	    	System.out.println("\nThird number is smallest" +res3);
	    else if((res4<res2) && (res4<res3) && (res4<res1))
	    	System.out.println("\nFourth number is smallest" +res4);
	
}
}
