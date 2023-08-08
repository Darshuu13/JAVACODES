
public class ReverseString {

	public static void main(String[] arg) {

		String str = "Darshan", empty = "";
		char c;

		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			empty = c + empty;

		}

		System.out.println("Reverse String is " + empty);

		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb.reverse();
		System.out.println("Reverse String is " + sb);
	}

}
