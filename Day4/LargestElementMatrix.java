package Day4;
/*
 * Largest Element Present in matrix
 */
import java.util.Scanner;

public class LargestElementMatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size :");
		int size=sc.nextInt();
		
		int[][] arr1=new int[size][size];
		
		
		System.out.println("Enter the element :");
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		
		int largest=arr1[0][0];
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
			   if(largest<arr1[i][j])
			   {
				   largest=arr1[i][j];
			   }
			}
		}
		System.out.println(largest);
		
	}

}
