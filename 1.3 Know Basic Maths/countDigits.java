import java.util.Scanner;

class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n != 0) {
            count += 1;
            n /= 10;
        }
        System.out.println(count);
        sc.close();
    }
}