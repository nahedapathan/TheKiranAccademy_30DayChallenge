package Day5;

import java.util.Scanner;

public class CopyPositivenumberArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		int[] nums=new int[size];
		for(int i=0;i<nums.length;i++)
		{
			nums[i]=sc.nextInt();
		}
		
		int count=0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]>0)
			{
				count++;
			}
		}
		
		int[] arr=new int[count];
		int index=0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]>0)
			{
				arr[index++]=nums[i];
			}
		}
		
		for(int num:arr)
		{
			System.out.print(num+" ");
		}
	}

}
