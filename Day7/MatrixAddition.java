package Day7;
/*
 * take 2 array and addition in array3 store it
 */

import java.util.Scanner;

public class MatrixAddition {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size :");
		int size=sc.nextInt();
		
		int[][] arr1=new int[size][size];
		int[][] arr2=new int[size][size];
		
		System.out.println("Enter the Element of 1st Array :");
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter the Element of 2st Array :");
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				arr2[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("1st array is :");
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("2st array is :");
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][] arr3=new int[size][size];
		for(int i=0;i<arr3.length;i++)
		{
			for(int j=0;j<arr3.length;j++)
			{
				arr3[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		
		System.out.println("Sum of 1 & 2 array is :");
		for(int i=0;i<arr3.length;i++)
		{
			for(int j=0;j<arr3.length;j++)
			{
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
	}

}
