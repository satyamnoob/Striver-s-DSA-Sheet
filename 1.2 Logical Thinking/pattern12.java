/*

    1      1
    12    21
    123  321
    12344321

*/

public class pattern12 {
  public static void main(String[] args) {
    int k = 0;
    for (int i = 0; i < 4; i++) {
      for (int j = 1; j <= i + 1; j++) {
        System.out.print(j);
      }
      for (int j = 1; j <= 6 - k; j++) {
        System.out.print(" ");
      }
      for (int j = i + 1; j >= 1; j--) {
        System.out.print(j);
      }
      k += 2;
      System.out.println();
    }
  }
}
