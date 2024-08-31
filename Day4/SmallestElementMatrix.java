package Day4;
/*
 * Smallest Element in Matrix
 */
import java.util.Scanner;

public class SmallestElementMatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size :");
		int size=sc.nextInt();
		
		int[][] arr=new int[size][size];
		System.out.println("Enter the Element :");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
	    int smallest=arr[0][0];
	    for(int i=0;i<arr.length;i++)
	    {
	    	for(int j=0;j<arr.length;j++)
	    	{
	    		if(smallest>arr[i][j])
	    		{
	    			smallest=arr[i][j];
	    		}
	    	}
	    }
	    System.out.println(smallest);
	}

}
