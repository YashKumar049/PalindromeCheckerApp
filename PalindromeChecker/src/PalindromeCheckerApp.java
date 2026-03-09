import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC1: Welcome Message
        System.out.println("========================================");
        System.out.println("Welcome to Palindrome Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized Successfully done");
        System.out.println("========================================");

        // UC2: User Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to check: ");
        String input = scanner.nextLine();

        String cleanInput = input.toLowerCase();

        // UC5: Stack Based Palindrome Check
        Stack<Character> stack = new Stack<>();

        // push characters
        for(char c : cleanInput.toCharArray()){
            stack.push(c);
        }

        // pop characters to make reverse
        StringBuilder reversed = new StringBuilder();

        while(!stack.isEmpty()){
            reversed.append(stack.pop());
        }

        System.out.println("Stack reversed string: " + reversed);

        // comparison
        if(cleanInput.equals(reversed.toString())){
            System.out.println("The string \"" + input + "\" IS a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a palindrome.");
        }

        scanner.close();
    }
}