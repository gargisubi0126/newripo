package com.bridgelab.practice;

public class Student {
	
	public static void main (String args[])
	{

	int arr[]= new int[] {40,60,89,55,75,32,12,15};
	int max=arr[0];
	//int min =arr[0];
	for(int i=1;i<arr.length;i++)
	{
	if(arr[i]>max)
	{
	max=arr[i];
	}
	
    }

	System.out.println("max no"  + max );
	}

}
