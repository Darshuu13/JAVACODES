// To find missing natural numbers in an array.
public class MissingNaturalNumbers {

	public static void main(String[] arg) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 9, 10 };

		int sum = (10 * 11) / 2;
		int actualSum = 0;

		for (int i = 0; i < arr.length; i++) {
			actualSum = actualSum + arr[i];
		}

		System.out.println("The missing natural number in an array is :" + (sum - actualSum));

	}

}
