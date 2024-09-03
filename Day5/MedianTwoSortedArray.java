package Day5;

import java.util.Arrays;

public class MedianTwoSortedArray {
	public static void main(String[] args) {
		int[] num1= {2,3,4};
		int[] num2= {1,5};
		
		int [] num3=new int[num1.length+num2.length];
		int index=0;
		
		for(int i=0;i<num1.length;i++)
		{
			num3[index++]=num1[i];
		}
		
		for(int i=0;i<num2.length;i++)
		{
			num3[index++]=num2[i];
		}
		
		int n=num3.length;
		Arrays.sort(num3);
		if(n%2==0)
		{
			System.out.println((num3[n/2-1]+num3[n/2])/2);
		}
		else
		{
			System.out.println(num3[n/2]);
		}
	}

}
