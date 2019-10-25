//Author: Eduard Le Roux
package Easy;

public class reverseString {
	
	/**
	 * 
	 * @param string takes in the string you want to reverse
	 * @param n length of the string
	 * @param reversed String Stringbuilder object to reverse the String
	 * @return returns recursively moveing from the back of the string to the front and prints out each character
	 */

	public static int reverseString(String string, int n, StringBuilder reversedString) {
		String[] stringArray = string.split("");
		if (n == 0) {
			return 0;
		} else {
			reversedString.append(stringArray[n - 1]);
			if (reversedString.length() == stringArray.length) {
				System.out.println(reversedString);
			}

			return reverseString(string, n - 1, reversedString);
		}
	}

	public static void main(String[] args) {
		String string = "Long string to test the function so that it prints it in reverse.";
		StringBuilder reverseString = new StringBuilder();
		reverseString(string, string.length(), reverseString);

	}

}
