package com.bridgelab.practice;

public class PrimeNo {
	

	
	public static void main(String[] args) 
	{
		int num=50,temp=0;
			int count = 0,sum=0;
			for(int i = 0;i <= num/2;i++)
			{
				if(num % 2 == 0 )
				{
					temp = temp-1;
					count++;
					sum=sum+i;
					break;
				}
				
			}
			
			if(temp==0)
				
			{
				System.out.println("no is prime");
			}
			else
			{
				System.out.println("no not prime");
			}
			System.out.println("The Count Of even Numbers are:" + count);
			System.out.println("The Sum Of even Numbers are:" + sum);
		}
	}
	
	
	

