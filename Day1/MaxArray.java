package Day1;

import java.util.Scanner;

public class MaxArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array :");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter the Element ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Maximum Elemrnt in array is :"+max);
		
	}

}
