package Day4;

import java.util.Scanner;

public class Sum2DArray {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size :");
		int size=sc.nextInt();
		
		int[][] arr1=new int[size][size];
		System.out.println("Enter the element 1st Array :");
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		
		
		System.out.println("Display 1st array");
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		int[][] arr2=new int[size][size];
		
		System.out.println("Enter the element of 2nd Array :");
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				arr2[i][j]=sc.nextInt();
			}
		}
		
	    System.out.println("Display 2nd array :");
	    for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][] arr3=new int[size][size];
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				arr3[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
	}

}
