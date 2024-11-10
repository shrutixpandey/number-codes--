import java.util.Scanner;

public class SpyNumber {
    
    public static boolean isSpyNumber(int num) {
        // Convert number to string to easily extract digits
        String numStr = Integer.toString(num);
        
        // If the number of digits is odd, it can't be a spy number
        if (numStr.length() % 2 != 0) {
            return false;
        }
        
        // Split the number into two halves
        int mid = numStr.length() / 2;
        String firstHalf = numStr.substring(0, mid);
        String secondHalf = numStr.substring(mid);
        
        // Calculate sum of digits in the first half
        int firstSum = 0;
        for (char c : firstHalf.toCharArray()) {
            firstSum += c - '0'; // Convert char to int
        }
        
        // Calculate sum of digits in the second half
        int secondSum = 0;
        for (char c : secondHalf.toCharArray()) {
            secondSum += c - '0'; // Convert char to int
        }
        
        // If the sums are equal, it is a spy number
        return firstSum == secondSum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        if (isSpyNumber(num)) {
            System.out.println(num + " is a spy number.");
        } else {
            System.out.println(num + " is not a spy number.");
        }
        
        scanner.close();
    }
}
