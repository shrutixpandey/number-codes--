import java.util.Scanner;

public class DuckNumber {

    // Method to check if a number is a Duck number
    public static boolean isDuckNumber(int number) {
        // Convert the number to a string
        String str = Integer.toString(number);
        
        // A Duck number cannot start with '0'
        if (str.charAt(0) == '0') {
            return false;
        }
        
        // Check if there is a zero somewhere after the first digit
        return str.contains("0");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Asking user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Checking if the number is a Duck number
        if (isDuckNumber(number)) {
            System.out.println(number + " is a Duck number.");
        } else {
            System.out.println(number + " is not a Duck number.");
        }
        
        scanner.close();
    }
}


