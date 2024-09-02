package com.tka.ArrayAssignment;

import java.util.Scanner;

public class CountEvenOddNumber1D {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size :");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		System.out.println("Enter the Element :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int EvenCount=0;
		int OddCount=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				EvenCount++;
			}
			else {
				OddCount++;
			}
		}
		System.out.println("Even Count :"+EvenCount+" Odd Count :"+OddCount);
		
	}

}
