package Day2;

public class ReverseArray {
	
	public static void main(String[] args) {
		int arr[]= {65,56,78,45,23,12,69};
		System.out.println(arr.length/2);
		for(int i=0;i<=arr.length/2;i++)
		{
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
