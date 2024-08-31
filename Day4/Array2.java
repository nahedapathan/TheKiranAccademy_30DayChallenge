package Day4;

import java.util.Scanner;

public class Array2 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row Size :");
		int rowSize=sc.nextInt();
		
		System.out.println("Enter column Size :");
		int colSize=sc.nextInt();
		
		int[][] arr=new int[rowSize][colSize];
		
		System.out.println("Enter element :");
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr.length;col++)
			{
				arr[row][col]=sc.nextInt();
			}
		}
		
		for(int row=0;row<rowSize;row++)
		{
			for(int col=0;col<colSize;col++)
			{
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
		
		
	}

}
