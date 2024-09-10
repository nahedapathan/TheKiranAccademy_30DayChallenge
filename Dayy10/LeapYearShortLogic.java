package Dayy10;

public class LeapYearShortLogic {
	public static void main(String[] args) {
		int year=2017;
		if((year%400==0) || ((year%4==0)&&(year%100!=0)))
		{
			System.out.println("Leap year");
		}
		else 
		{
			System.out.println("Not Leap Year");
		}
	}
	

}
