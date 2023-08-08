//Remove characters from string
public class RemovecharacterFromString {

	public static void main(String[] args) {
		String str = "darshands";

		System.out.println("String after removing the character d :" + str.replaceAll("d", ""));

		char ch = 'd';

		removeChar(str, ch);
	}

	public static void removeChar(String s, char c) {

		String finalstr = "";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != c) {
				finalstr = finalstr + s.charAt(i);

			}
		}
		
		System.out.println("String after removing the character d :" + finalstr);
	}
}
