import java.util.Scanner;

public class q4PrintNTo1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    print1ToN(n);
    sc.close();
  }

  private static void print1ToN(int n) {
    if (n == 0) return;
    System.out.println(n);
    print1ToN(n - 1);
  }
}
