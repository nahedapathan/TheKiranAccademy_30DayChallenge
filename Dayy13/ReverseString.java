package Dayy13;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		String newStr="";
		for(int i=str.length()-1;i>=0;i--)
		{
			newStr=newStr+str.charAt(i);
		}
		System.out.println(newStr);
	}

}
