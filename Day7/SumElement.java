package Day7;

import java.util.Scanner;

/*
 * 3 rows 5 columns calculate the sum of Array
 */
public class SumElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row Size :");
		int row=sc.nextInt();
		
		System.out.println("Enter the Column Size :");
		int col=sc.nextInt();
		
		int[][] arr=new int[row][col];
		
		
		System.out.println("Enter the element ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Display element ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		
		int sum=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				sum+=arr[i][j];
			}
		}
		System.out.println("Sum is :"+sum);
	}

}
