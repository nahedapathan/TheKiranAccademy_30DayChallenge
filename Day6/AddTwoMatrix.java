package com.tka.ArrayAssignment;

import java.util.Scanner;

public class AddTwoMatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size :");
		int size=sc.nextInt();
		
		int[][] num1=new int[size][size];
		int[][] num2=new int[size][size];
		System.out.println("Enter the 1st Array Element ");
		for(int i=0;i<num1.length;i++)
		{
			for(int j=0;j<num2.length;j++)
			{
				num1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter the 2nd  Array Element ");
		for(int i=0;i<num1.length;i++)
		{
			for(int j=0;j<num2.length;j++)
			{
				num2[i][j]=sc.nextInt();
			}
		}
		
		int[][] sumArr=new int[size][size];
		for(int i=0;i<sumArr.length;i++)
		{
			for(int j=0;j<sumArr.length;j++)
			{
				sumArr[i][j]=num1[i][j]+num2[i][j];
			}
		}
		
		for(int i=0;i<sumArr.length;i++)
		{
			for(int j=0;j<sumArr.length;j++)
			{
				System.out.print(sumArr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
