import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(findGcd(a, b));
        sc.close();
    }

    private static int findGcd(int a, int b) {
        if(b == 0) {
            return a;
        }
        return findGcd(b, a % b);
    }
}
