public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "radar";
        System.out.println("Input String: " + input);
        if (isPalindrome(input)) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is not a palindrome.");
        }
    }
    public static boolean isPalindrome(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            if (charArray[left] != charArray[right]) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }

        return true;

    }
}
