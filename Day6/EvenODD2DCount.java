package com.tka.ArrayAssignment;

import java.util.Scanner;

public class EvenODD2DCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size :");
		int size=sc.nextInt();
		
		int[][] arr=new int[size][size];
		System.out.println("Enter the Element :");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		int evenCount=0;
		int oddCount=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i][j]%2==0)
				{
					evenCount++;
				}
				else
				{
					oddCount++;
				}
			}
		}
		System.out.println("Even Count is :"+evenCount+" Odd Count is :"+oddCount);
	}

}
