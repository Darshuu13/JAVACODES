//To find special character in string and to print the remaining characters in the String
public class SpecialCharacter {

	public static void main(String[] args) {

		String str = "Darshan@!#$%Shinde";
		int count = 0;
		String removedSC = "";

		for (int i = 0; i < str.length(); i++) {

			if (!Character.isDigit(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))
					&& !Character.isLetter(str.charAt(i))) {
				count++;
			} else {
				removedSC = removedSC + str.charAt(i);
			}

		}

		System.out.println("String after removing the special character will be: " + removedSC);

		if (count == 0) {
			System.out.println("No special characters found in the String");
		} else {
			System.out.println("Special character found in the string are/is: " + count);
		}

	}

}
