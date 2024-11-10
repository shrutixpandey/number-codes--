import java.util.Scanner;

public class PronicNumber {

    public static boolean isPronicNumber(int num) {
        for (int i = 0; i * (i + 1) <= num; i++) {
            if (i * (i + 1) == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a pronic number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isPronicNumber(number)) {
            System.out.println(number + " is a pronic number!");
        } else {
            System.out.println(number + " is not a pronic number.");
        }
    }
}
