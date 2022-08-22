/*

1 
0 1 
0 1 0 
1 0 1 0 
1 0 1 0 1 

*/

public class pattern11 {
  public static void main(String[] args) {
    char ch = '1';
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(ch + " ");
        ch = (ch == '0') ? '1' : '0';
      }
      System.out.println();
    }
  }
}
