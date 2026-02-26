import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "madam";
        System.out.println("Input String: " + input);
        if (isPalindrome(input)) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is not a palindrome.");
        }
    }public static boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            char reversedChar = stack.pop();
            if (str.charAt(i) != reversedChar) {
                return false;
            }
        }

        return true;

    }
}
