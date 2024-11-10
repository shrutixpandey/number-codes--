import java.util.Scanner;

public class NeonNumber {

    public static boolean isNeonNumber(int num) {
        int square = num * num;
        int sumOfDigits = 0;

        // Sum the digits of the square
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }

        // Check if the sum of digits is equal to the original number
        return sumOfDigits == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a neon number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isNeonNumber(number)) {
            System.out.println(number + " is a neon number!");
        } else {
            System.out.println(number + " is not a neon number.");
        }
    }
}

