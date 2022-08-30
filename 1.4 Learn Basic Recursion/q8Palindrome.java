import java.util.Scanner;

public class q8Palindrome {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    if (isPalindrome(str, 0, str.length() - 1, str.length())) {
      System.out.println("Palindrome");
    } else System.out.println("Not A Palindrome");
    sc.close();
  }

  private static boolean isPalindrome(String str, int s, int e, int len) {
    if (s > e) return true;
    if (str.charAt(s) == str.charAt(e)) return isPalindrome(
      str,
      s + 1,
      e - 1,
      len
    ); else return false;
  }
}
