import java.util.Arrays;

//To check if two arrays are equal or not.
public class CheckTwoArrays {

	public static void main(String[] arg) {
		int[] arr1 = { 2, 9, 87, 45 };
		int[] arr2 = { 9, 2, 87, 45 };

		if (areequal(arr1, arr2)) {
			System.out.println("Two array are equal");
		} else {
			System.out.println("Two array are not equal");
		}
	}

	public static boolean areequal(int arr1[], int arr2[]) {

		int n = arr1.length;
		int m = arr2.length;

		if (n != m) {
			return false;
		}

		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for (int i = 0; i < n; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}

		return true;
	}
}
