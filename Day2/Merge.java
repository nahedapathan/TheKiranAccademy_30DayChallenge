package Day2;

import java.util.Scanner;

public class Merge {
	
	void inputArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size :");
		int size=sc.nextInt();
		
		int arr1[]=new int[size];
		System.out.print("Enter the "+size+" Value of array 1:");
		for(int i=0 ;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		int arr2[]=new int[size];
		System.out.print("Enter the "+size+" Value of array 2:");
		for(int i=0 ;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		System.out.println("Display array 1");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println("Display array 2");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		mergeArray(arr1,arr2);
	}

	void mergeArray(int[] arr1, int[] arr2) {
	
		int arr3[]=new int[arr1.length+arr2.length];
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
