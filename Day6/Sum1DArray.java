package com.tka.ArrayAssignment;

import java.util.Scanner;

public class Sum1DArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		
		System.out.println("Enter the Element :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println("Sum of Element is :"+sum);
	}
}
