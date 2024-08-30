package Day3;

public class OddNumberSum {
	public static void main(String[] args) {
		int[] arr= {32,24,51,89,65};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
		    if(arr[i]%2!=0)
		    {
		    	sum+=arr[i];
		    }
		}
		System.out.println(sum);
	}

}
