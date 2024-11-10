import java.util.Scanner;

public class DudeneyNumber {

    public static boolean isDudeneyNumber(int num) {
        int sumOfDigits = 0;
        int originalNum = num;

        // Calculate the sum of digits
        while (num > 0) {
            sumOfDigits += num % 10;
            num /= 10;
        }

        // Check if the cube of the sum of digits equals the original number
        return Math.pow(sumOfDigits, 3) == originalNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a Dudeney number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isDudeneyNumber(number)) {
            System.out.println(number + " is a Dudeney number!");
        } else {
            System.out.println(number + " is not a Dudeney number.");
        }
    }
}

