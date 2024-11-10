import java.util.Scanner;

public class DisariumNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it is a Disarium Number: ");
        int number = scanner.nextInt();

        if (isDisarium(number)) {
            System.out.println(number + " is a Disarium Number.");
        } else {
            System.out.println(number + " is not a Disarium Number.");
        }

        scanner.close();
    }

    public static boolean isDisarium(int number) {
        int sum = 0;
        int numDigits = Integer.toString(number).length();
        int temp = number;

        // Calculate the sum of each digit raised to its position
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            temp /= 10;
            numDigits--;
        }

        // Check if the sum is equal to the original number
        return sum == number;
    }
}

