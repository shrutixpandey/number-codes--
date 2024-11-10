import java.util.Scanner;

public class HarshadMagicNumber {

    // Check if the number is a Harshad number
    public static boolean isHarshadNumber(int num) {
        int sumOfDigits = 0;
        int originalNum = num;

        // Calculate the sum of digits
        while (num > 0) {
            sumOfDigits += num % 10;
            num /= 10;
        }

        // Check if the original number is divisible by the sum of its digits
        return originalNum % sumOfDigits == 0;
    }

    // Check if the number is a Magic number
    public static boolean isMagicNumber(int num) {
        int sum = num;

        // Continue summing the digits until we get a single digit
        while (sum > 9) {
            sum = sumOfDigits(sum);
        }

        // Check if the final single digit is 1
        return sum == 1;
    }

    // Helper method to calculate sum of digits
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a Harshad Magic number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isHarshadNumber(number) && isMagicNumber(number)) {
            System.out.println(number + " is a Harshad Magic number!");
        } else {
            System.out.println(number + " is not a Harshad Magic number.");
        }
    }
}

