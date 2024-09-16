package Dayy12;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num=sc.nextInt();
		int count=0;
		
		if(num==1)
		{
			System.out.println("1 is neither Prime nor Composite");
			return;
		}
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println(num+" is Prime Number ");
		}
		else
		{
			System.out.println(num+" is not Prime Number ");
		}
	}
}
