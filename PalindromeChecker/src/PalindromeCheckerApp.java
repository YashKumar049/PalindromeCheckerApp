import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Palindrome Checker (UC11 - Ignore Spaces) =====");

        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        boolean result = isPalindrome(input);

        if(result){
            System.out.println("The string \"" + input + "\" IS a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a palindrome.");
        }

        scanner.close();
    }

    // Method to prepare string
    public static boolean isPalindrome(String input) {

        if (input == null || input.isEmpty()) {
            return false;
        }

        // Remove spaces and convert to lowercase
        String clean = input.replaceAll("\\s+", "").toLowerCase();

        return checkPalindrome(clean, 0, clean.length() - 1);
    }

    // Recursive palindrome check
    public static boolean checkPalindrome(String str, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return checkPalindrome(str, start + 1, end - 1);
    }
}