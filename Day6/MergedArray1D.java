package com.tka.ArrayAssignment;

import java.util.Scanner;

public class MergedArray1D {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size :");
		int size=sc.nextInt();
		
		int[] arr1=new int[size];
		int[] arr2=new int[size];
		System.out.println("Enter the Element of 1st Array :");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter the Element of 2st Array :");
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		int[] arr3=new int[arr1.length+arr2.length];
		int index=0;
		for(int i=0;i<arr1.length;i++)
		{
			arr3[index++]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++)
		{
			arr3[index++]=arr2[i];
		}
		
		for(int i=0;i<arr3.length;i++)
		{
			System.out.print(arr3[i]+" ");
		}
		
		
		
	}

}
