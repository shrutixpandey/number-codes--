import java.util.Scanner;

public class ArmstrongNumber {

    public static boolean isArmstrongNumber(int num) {
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        // Calculate the sum of each digit raised to the power of the number of digits
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        // Check if the sum is equal to the original number
        return sum == originalNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number!");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}

