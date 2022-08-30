import java.util.Scanner;

public class q1PrintNTimes {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char ch = sc.nextLine().charAt(0);
    int n = sc.nextInt();
    printNTimes(ch, n);
    sc.close();
  }

  private static void printNTimes(char ch, int n) {
    if(n == 0) {
      return;
    }
    System.out.println(ch);
    printNTimes(ch, n - 1);
  }
}
