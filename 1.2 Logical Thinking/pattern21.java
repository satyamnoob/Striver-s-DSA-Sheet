/* 
****
*  *
*  *
*  *
****
*/

public class pattern21 {
  public static void main(String[] args) {
    int n = 20;
    for (int i = 1; i <= n; i++) {
      if (i == 1 || i == n) {
        for (int j = 0; j < n; j++) {
          System.out.print("*");
        }
      }
      else {
        System.out.print("*");
        for (int j = 0; j < n - 2; j++) {
            System.out.print(" ");
        }
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
