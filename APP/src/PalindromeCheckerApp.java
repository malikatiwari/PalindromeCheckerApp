
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "level";
        System.out.println("Testing String: " + input);
        if (isPalindrome(input)) {
            System.out.println("Result: Success! It is a palindrome.");
        } else {
            System.out.println("Result: Failure! It is not a palindrome.");
        }
    }
    public static boolean isPalindrome(String str) {
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            queue.add(ch);
            stack.push(ch);
        }
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                return false;
            }
        }

        return true;

    }
}
