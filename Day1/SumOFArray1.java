package Day1;

import java.util.Scanner;

public class SumOFArray1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size :");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter the"+ size +" element :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("The Elsements are :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		int sum=0;
		System.out.print("Sum of element are :");
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println(sum);
	}

}
