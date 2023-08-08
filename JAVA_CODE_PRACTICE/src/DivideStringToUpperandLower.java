// Diviide the given string into two parts. convert the first part in lowercase and second par to uppercase.
public class DivideStringToUpperandLower {

	public static void main(String[] arg) {

		String str = "bvhwgvkbgvkwgbvyweigfkjnljgtdVKYFDJHEBWHKFgiygkjdsbgkhewgtfy";

		int mid = str.length() / 2;
        String UpperCase="";
        String LowerCase="";
        
		for(int i=0;i<str.length(); i++) {
			if(i<mid) {
				LowerCase=LowerCase + Character.toLowerCase(str.charAt(i));
			}
			else {
				UpperCase=UpperCase + Character.toUpperCase(str.charAt(i));
			}
		}
		
		System.out.println(LowerCase+UpperCase);
	}

}
