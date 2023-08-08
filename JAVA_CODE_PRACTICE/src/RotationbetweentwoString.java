//To check if two string have a rotation of characters between them
public class RotationbetweentwoString {

	public static void main(String[] arg) {
		
		String str1="ABCDEX";
		String str2="DEFABC";
	
		if(checkRotation(str1, str2)) {
			System.out.println("Given strings are rotations of each other.");
		}
		else {
			System.out.println("Given strings are not rotations of each other.");
		}
		
	}
	
	
	public static boolean checkRotation(String str1, String str2) {
		return (str1.length()==str2.length() && (str1+str1).indexOf(str2)!=1);
		
	}
	
}
