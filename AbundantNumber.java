import java.util.Scanner;

public class AbundantNumber {

    public static boolean isAbundantNumber(int num) {
        int sum = 0;

        // Find all divisors and sum them
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        // Check if sum of divisors is greater than the number
        return sum > num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's an abundant number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isAbundantNumber(number)) {
            System.out.println(number + " is an abundant number!");
        } else {
            System.out.println(number + " is not an abundant number.");
        }
    }
}
