package com.bridgelab.practice;

public class Pro 
{
//	public static void main(String[] args) 
//	
//		{
//			int count = 0;
//			for(int i = 1;i <= 50;i++)
//			{
//				if(i % 2 == 0 )
//				{
//					count++;
//				}
//			}
//			System.out.println("The Count Of even Numbers are:" + count);
//		}
	
	
	public static void even()
	{
		
		{
			int count = 0,sum=0;
			for(int i = 1;i <= 50;i++)
			{
				if(i % 2 == 0 )
				{
					count++;
					sum=sum+i;
				}
				
			}
			System.out.println("The Count Of even Numbers are:" + count);
			System.out.println("The Sum Of even Numbers are:" + sum);
		}
	}
		
	
	public static void odd()
	{
		{
			int count = 0 ,sum=0;
			for(int i = 1;i <= 50;i++)
			{
				if(i % 2 != 0 )
				{
					count++;
					sum=sum+i;
				}
				
			}
			System.out.println("The Count Of odd Numbers are:" + count);
			System.out.println("The Sum Of odd Numbers are:" + sum);
		}
	}
	
		public static void main(String[] args)
		{
//			//by calling object creation
//			Pro s = new Pro();
//			Pro.even();
//			Pro.odd();
//			
//			//by calling class name
//			Pro.even();
//			Pro.odd();
			
			//by calling method neme directly 
			even();
			odd();
			
			
			
		}
		
		
	}


