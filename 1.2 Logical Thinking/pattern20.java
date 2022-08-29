/*   
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
*/

public class pattern20 {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      for (int j = 0; j < 8 - (i * 2); j++) {
        System.out.print(" ");
      }
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4 - i; j++) {
        System.out.print("*");
      }
      for (int j = 0; j < (i * 2) + 2; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < 4 - i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
