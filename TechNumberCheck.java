import java.util.Scanner;

public class TechNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it is a Tech Number: ");
        int number = scanner.nextInt();

        if (isTechNumber(number)) {
            System.out.println(number + " is a Tech Number.");
        } else {
            System.out.println(number + " is not a Tech Number.");
        }

        scanner.close();
    }

    public static boolean isTechNumber(int number) {
        // Convert the number to a string to check its length
        String numStr = Integer.toString(number);

        // Check if it has an even number of digits
        if (numStr.length() % 2 != 0) {
            return false;
        }

        // Split the number into two halves
        int halfLength = numStr.length() / 2;
        int firstHalf = Integer.parseInt(numStr.substring(0, halfLength));
        int secondHalf = Integer.parseInt(numStr.substring(halfLength));

        // Check if the square of the sum of the halves equals the original number
        int sum = firstHalf + secondHalf;
        return sum * sum == number;
    }
}
