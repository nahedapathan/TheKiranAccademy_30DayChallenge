package Day4;

import java.util.Scanner;

/*
 * Sum of all element in Matrix
 */
public class SumOFMatrix {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size :");
		int size=sc.nextInt();
		
		int arr[][]=new int[size][size];
		System.out.println("Enter the Element :");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				arr[i][j]=sc.nextInt();	
			}
		}
		
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				sum+=arr[i][j];
			}
		}
		System.out.println(sum);
	}

}
