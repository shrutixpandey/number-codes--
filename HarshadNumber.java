import java.util.Scanner;

public class HarshadNumber {

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a Harshad number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isHarshadNumber(number)) {
            System.out.println(number + " is a Harshad number!");
        } else {
            System.out.println(number + " is not a Harshad number.");
        }
    }
}
