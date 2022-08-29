/* 
 
    A   
   ABA  
  ABCBA 
 ABCDCBA

*/

public class pattern17 {
  public static void main(String[] args) {
    int k = 1;
    for (int i = 0; i < 4; i++) {
      char ch = 'A' - 1;
      for (int j = 0; j < 3 - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i + k; j++) {
        if ((j <= ((k + i) / 2) + 1)) {
          ch++;
        } else {
          ch--;
        }
        System.out.print(ch);
      }
      for (int j = 0; j < 3 - i; j++) {
        System.out.print(" ");
      }
      k++;
      System.out.println();
    }
  }
}
