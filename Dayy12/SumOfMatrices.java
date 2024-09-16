package Dayy12;

import java.util.Scanner;

public class SumOfMatrices {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of 1st Matrice");
		int size=sc.nextInt();
		
		int[][] arr=new int[size][size];
		int[][] arr2=new int[size][size];
		int[][] sum=new int[size][size];
		
		System.out.println("Enter the Element of 1st Matrix :");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter the Element of 2nd MAtrix :");
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				arr2[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Sum of two matrices :");
		for(int i=0;i<sum.length;i++)
		{
			for(int j=0;j<sum.length;j++)
			{
				sum[i][j]=arr[i][j]+arr2[i][j];
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
	}
	
}
