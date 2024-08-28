package Day1;

public class SumOfArray {

	public static void main(String[] args) {
		int arr[]=new int[5];
		arr[0]=36;
		arr[1]=8;
		arr[2]=98;
		arr[3]=6;
		arr[4]=58;
		
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println(sum);
	}
}
