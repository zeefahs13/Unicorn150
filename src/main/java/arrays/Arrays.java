package arrays;

public class Arrays {

	/*
	 * One cannot compute the sum of elements of an array without visiting them if
	 * array elements are not known in before hand.
	 * 
	 * If the array elements are known in before hand, we can compute in O(1) time
	 * and O(1) space complexity
	 */

	// O(n) solution
	protected int sumOfElements(int[] arr) {
		int sum = 0;
		for (int i=1;i<arr.length;i++) {

			sum = sum + i;

		}

		return sum;

	}

	protected int sumOfnNaturalNumbers(int[] arr) {
		int sum = 0;

		int n = arr.length;

		sum = (n * (n - 1) / 2);

		return sum;
	}

	public static void main(String[] args) {
		
		int[] arr=new int[] {1,2,3,4,5,6,7,8,9,10};
		
		Arrays array = new Arrays();
		int sum=array.sumOfElements(arr);
		System.out.println("sum normal:"+sum);
		long sum1=array.sumOfnNaturalNumbers(arr);
		System.out.println("sum :"+sum1);
		

	}

}