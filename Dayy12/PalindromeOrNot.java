package Dayy12;

import java.util.Scanner;

public class PalindromeOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num=sc.nextInt();
		int rev=0;
		
		for(int i=num;i>0;i/=10)
		{
			int rem=i%10;
			rev=rev*10+rem;
			
		}
		if(num==rev)
		{
			System.out.println(num+" is Palindrome Number");
		}
		else
		{
			System.out.println(num+" is not Palindrome Number");
		}
		
		
	}

}
