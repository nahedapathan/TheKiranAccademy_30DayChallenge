package Dayy13;

import java.util.Scanner;

public class CountVowel {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		int countVowel=0;
		int countConst=0;
		
		String str2=str.toLowerCase();
		for(int i=0;i<str2.length();i++)
		{
			if(str2.charAt(i)=='a' || str2.charAt(i)=='e' || str2.charAt(i)=='i' || str2.charAt(i)=='o' || str2.charAt(i)=='u')
			{
				countVowel++;
			}
			else
			{
				countConst++;
			}
		}
		System.out.println("Vowel Count "+countVowel);
		System.out.println("Consonants Count "+countConst);
	}

}
