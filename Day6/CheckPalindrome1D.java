package com.tka.ArrayAssignment;

import java.util.Scanner;

public class CheckPalindrome1D {
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
		
		boolean palindrome=true;
		int n=arr.length;
		for(int i=0;i<n/2;i++)
		{
			if(arr[i]!=arr[n-1-i])
			{
				palindrome=false;
			}
		}
		
		if(palindrome)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
