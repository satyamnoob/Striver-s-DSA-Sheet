import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int pow = findLength(a);
        int ans = armstrong(a, pow);
        System.out.println((ans == a) ? "Armstrong Number" : "Not an armstrong number");
        sc.close();
    }

    private static int armstrong(int a, int pow) {
        int ans = 0;
        while (a != 0) {
            ans += (int)Math.pow(a % 10, pow);
            a /= 10;
        }
        return ans;
    }

    private static int findLength(int a) {
        return String.valueOf(a).length();
    }
}
