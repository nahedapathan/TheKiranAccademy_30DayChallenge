package Day9;

public class SwappingWithoutVariable {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		System.out.println("a :"+a+" b :"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a :"+a+" b :"+b);
	}
}
