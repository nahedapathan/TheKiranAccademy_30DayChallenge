package Day3;

public class EvenNumberSum {
	public static void main(String[] args) {
		int[] arr={36,45,12,78,11,21,22,40};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				sum+=arr[i];
				
			
			}
		}
		System.out.println(sum);
	}

}
