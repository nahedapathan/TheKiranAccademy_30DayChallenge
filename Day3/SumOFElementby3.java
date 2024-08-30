package Day3;

public class SumOFElementby3 {
	
	
	public static void main(String[] args) {
		int arr[]= {22,23,54,85,96};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%3==0)
			{
				sum+=arr[i];
			}
		}
		System.out.println("Sum of element :"+sum);
	}

}
