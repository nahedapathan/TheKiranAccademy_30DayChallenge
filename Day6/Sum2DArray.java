package com.tka.ArrayAssignment;

import java.util.Scanner;

public class Sum2DArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size :");
		int size=sc.nextInt();
		
		int[][] num1=new int[size][size];
		
		System.out.println("Enter the Element of Array :");
		for(int i=0;i<num1.length;i++)
		{
			for(int j=0;j<num1.length;j++)
			{
				num1[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		
		for(int i=0;i<num1.length;i++)
		{
			for(int j=0;j<num1.length;j++)
			{
				sum+=num1[i][j];
			}
		}
		System.out.println("Sum is "+sum);
		
		
	}
}
