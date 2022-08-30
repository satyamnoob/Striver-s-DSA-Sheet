import java.util.Scanner;

/**
 * q5SumOfFirstNNumbers
 */
public class q5SumOfFirstNNumbers {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = calcSum(0, 1, n);
    System.out.println(sum);
    sc.close();
  }

  private static int calcSum(int sum, int d, int n) {
    if (d == n + 1) return sum;
    return calcSum(sum + d, d + 1, n);
  }
}
