import java.util.Scanner;

public class checkPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = n;
        int rev = 0;
        while(c != 0) {
            rev = rev * 10 + (c % 10);
            c /= 10;
        }
        if(n == rev)
            System.out.println("Palindrome");
        else 
            System.out.println("Not a palindrome");
        sc.close();
    }
}
