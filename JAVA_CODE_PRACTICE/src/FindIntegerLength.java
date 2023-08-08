//Find the length of the integer.
public class FindIntegerLength {

	public static void main(String[] arg) {

		int a = 123456;

		// Using inbuild method
		String s = Integer.toString(a);
		System.out.println("The length of Integer is :" + s.length());

		int count = 0;
		while (a > 0) {
			count++;
			a = a / 10;
		}
		System.out.println("The length of Integer is :" + count);
	}

}
