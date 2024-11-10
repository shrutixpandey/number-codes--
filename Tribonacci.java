public class Tribonacci {

    public static int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;

        int a = 0, b = 1, c = 1, sum = 0;

        for (int i = 3; i <= n; i++) {
            sum = a + b + c;
            a = b;
            b = c;
            c = sum;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 10; // Example: 10th Tribonacci number
        System.out.println("The " + n + "th Tribonacci number is: " + tribonacci(n));
    }
}

