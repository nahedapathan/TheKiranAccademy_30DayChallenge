package com.tka.ArrayAssignment;

import java.util.Scanner;

public class CountPosNeg2D {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size :");
		int size=sc.nextInt();
		
		int[][] arr=new int[size][size];
		System.out.println("Enter the Element  ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		int countPos=0;
		int countNeg=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i][j]>0)
				{
					countPos++;
				}
				else
				{
					countNeg++;
				}
			}
		}
		System.out.println("Positive Count :"+countPos+" Negative Count :"+countNeg);
	}

}
