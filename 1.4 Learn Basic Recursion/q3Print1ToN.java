import java.util.Scanner;

public class q3Print1ToN {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    print1ToN(1, n);
    sc.close();
  }

  private static void print1ToN(int d, int n) {
    if(d == n + 1) 
        return;
    System.out.println(d);
    print1ToN(d + 1, n); 
  }
}
