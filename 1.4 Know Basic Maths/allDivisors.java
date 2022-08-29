import java.util.Scanner;

public class allDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n)) {
            System.out.println("1 " + n);
        }
        else {
            printDivisors(n);
        }
        sc.close();
    }

    private static void printDivisors(int n) {
        for (int i = 1; i <= (int)Math.sqrt(n); i++) {
            if(n % i == 0) {
                System.out.print((i == (n / i)) ? i + " " : i + " " + (n / i) + " ");
            }
        }
        System.out.println();
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i < (int) Math.sqrt(n); i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
