public class StringIsPalindrome {
    public static void main(String[] args) {
        String str = "ababb";
        if(isPalindrome(str)) {
            System.out.println("The string " + str + " is palindrome.");
        } else {
            System.out.println("The string " + str + " is not a palindrome." );
        }
    }

    private static boolean isPalindrome(String str) {
        String reversedStr = new StringBuffer(str).reverse().toString();
        if(reversedStr.equals(str)){
            return true;
        }
        return false;
    }
}
