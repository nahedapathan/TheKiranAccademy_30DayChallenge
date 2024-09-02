package com.tka.ArrayAssignment;

import java.util.Scanner;

public class Reverse1D {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size :");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		System.out.println("Enter the element :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int num:arr)
		{
			System.out.print(num+" ");
		}
		System.out.println();
		
		for(int i=0;i<arr.length/2;i++)
		{
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		for(int num:arr)
		{
			System.out.print(num+" ");
		}
		
	}

}
