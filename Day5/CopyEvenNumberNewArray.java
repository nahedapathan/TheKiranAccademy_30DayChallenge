package Day5;

import java.util.Scanner;

public class CopyEvenNumberNewArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				count++;
			}
		}
		int[] arr1=new int[count];
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				arr1[index++]=arr[i];
			}
		}
		for(int num:arr1)
		{
			System.out.println(num);
		}
	}

}
