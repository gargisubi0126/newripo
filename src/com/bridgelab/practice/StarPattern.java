package com.bridgelab.practice;

public class StarPattern {

	public static void main(String[] args)
	{
		//int rows=5;
		
		for(int i=0;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				for(int k=1;k<=j;k++) 
					
				{
					System.out.print("*");
					
				}
				
				System.out.print("*");
				
			}
			System.out.println("");
		}
	}
}
