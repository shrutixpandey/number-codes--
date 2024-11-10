import java.util.Scanner;

public class BouncyNumber {

    // Function to check if a number is bouncy
    public static boolean isBouncy(int num) {
        String numStr = String.valueOf(num);

        // Flags to check the direction of digits
        boolean increasing = false;
        boolean decreasing = false;

        // Traverse through the digits
        for (int i = 1; i < numStr.length(); i++) {
            if (numStr.charAt(i) > numStr.charAt(i - 1)) {
                increasing = true;
            } else if (numStr.charAt(i) < numStr.charAt(i - 1)) {
                decreasing = true;
            }

            // If both increasing and decreasing are true, it's a bouncy number
            if (increasing && decreasing) {
                return true;
            }
        }
        return false; // If the number is either strictly increasing or strictly decreasing
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a bouncy number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isBouncy(number)) {
            System.out.println(number + " is a bouncy number!");
        } else {
            System.out.println(number + " is not a bouncy number.");
        }
    }
}

