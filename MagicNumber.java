import java.util.Scanner;

public class MagicNumber {

    public static boolean isMagicNumber(int num) {
        while (num > 9) {
            num = sumOfDigits(num);
        }
        return num == 1;
    }

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
        System.out.print("Enter a number to check if it's a magic number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isMagicNumber(number)) {
            System.out.println(number + " is a magic number!");
        } else {
            System.out.println(number + " is not a magic number.");
        }
    }
}

