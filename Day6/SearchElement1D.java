package com.tka.ArrayAssignment;

import java.util.Scanner;

public class SearchElement1D {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		System.out.println("Enter the element :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the element you want to Search :");
		int target=sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				System.out.println("Element Found index "+i);
				break;
			}
		}
		System.out.println("Element Not Found ");
	}

}
