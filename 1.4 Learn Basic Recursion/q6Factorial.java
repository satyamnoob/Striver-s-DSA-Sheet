import java.util.Scanner;

public class q6Factorial {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int f = calcFactorial(1, 2, n);
    System.out.println(f);
    sc.close();
  }

  private static int calcFactorial(int factorial, int d, int n) {
    if (d == n + 1) return factorial;
    return calcFactorial(factorial * d, d + 1, n);
  }
}
