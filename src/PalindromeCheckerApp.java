
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC2.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Step 1: Predefined string to check
        String input = "madam";
        String cleanInput = input.toLowerCase();

        boolean isPalindrome = true;
        int length = cleanInput.length();

        // Step 2: Compare characters from both ends
        for (int i = 0; i < length / 2; i++) {
            if (cleanInput.charAt(i) != cleanInput.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Step 3: Display the result
        System.out.println("Testing String: " + input);
        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }
}