import java.util.Scanner;

public class q2printNameNTimes {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    int n = sc.nextInt();
    printNTimes(name, n);
    sc.close();
  }

  private static void printNTimes(String name, int n) {
    if(n == 0) {
        return;
      }
      System.out.println(name);
      printNTimes(name, n - 1);
  }
}
