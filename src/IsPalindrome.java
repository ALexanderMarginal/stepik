public class IsPalindrome {
	/**
	 * Checks if given <code>text</code> is a palindrome.
	 *
	 * @param text any string
	 * @return <code>true</code> when <code>text</code> is a palindrome, <code>false</code> otherwise
	 */
	public static boolean isPalindrome(String text) {
		String string = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		StringBuilder stringBuilder = new StringBuilder(string);
		return string.equals(stringBuilder.reverse().toString());
	}
}
