package Dayy13;

import java.util.Scanner;

public class LowercaseToUpperCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		String newstr="";
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			int ascii=(int)ch;
			if(ascii>=97 && ascii<=122)
			{
				int newascii=ascii-32;
				char newch=(char)newascii;
				newstr=newstr+newch;
			}
			else
			{
				newstr=newstr+ch;
			}
		}
		System.out.println(newstr);
	}
}
