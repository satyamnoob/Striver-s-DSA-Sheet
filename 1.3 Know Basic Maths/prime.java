import java.util.Scanner;

public class prime {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (isPrime(n)) {
      System.out.println("Prime Number");
    }
    else {
        System.out.println("Not A Prime Number");
    }
    sc.close();
  }

  private static boolean isPrime(int n) {
    for (int i = 2; i < (int) Math.sqrt(n); i++) {
      if (n % i == 0) return false;
    }
    return true;
  }
}
