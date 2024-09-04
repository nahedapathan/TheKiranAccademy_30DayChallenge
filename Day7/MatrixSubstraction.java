package Day7;

import java.util.Scanner;

public class MatrixSubstraction {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size :");
		int size=sc.nextInt();
		
		int[][] arr1=new int[size][size];
		int[][] arr2=new int[size][size];
		System.out.println("Enter the  Element :");
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter the Element 2 Array :");
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				arr2[i][j]=sc.nextInt();
			}
		}
		
		int[][] arr3=new int[size][size];
		
		for(int i=0;i<arr3.length;i++)
		{
			for(int j=0;j<arr3.length;j++)
			{
				arr3[i][j]=arr1[i][j]-arr2[i][j];
			}
		}
		

		System.out.println("Substraction of 1 & 2 Array  :");
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
