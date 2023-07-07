package com.bridgelab.practice;

public class Array {
	
	public static void main(String[] args) {
		
		
	
//		int ar[] = {1,2,3,4,5};
//		
//		int i,x;
//		
//		for(i=0;i<ar.length; i++)
//		{
//			x= ar[i];
//			
//			System.out.println(" At index"  + i + "");
//			
//			
//			
//			System.out.println("value of index position" + x + "");
//			
//			System.out.println();
//		}
//	}
	
	
int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        
        int count = 0;
        int sum = 0;
        
        System.out.println("Even no");
        
        for (int number : numbers) 
        {
            if (number % 2 == 0) 
            {  
            	 
            	 System.out.println( number + "");
                count++;
                sum += number;
            }
        }
        
       
        System.out.println("Count of even numbers: " + count);
        System.out.println("Sum of even numbers: " + sum);
    }

   
	}




