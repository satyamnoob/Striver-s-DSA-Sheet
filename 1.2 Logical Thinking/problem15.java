/* 

    ABCDE
    ABCD
    ABC
    AB
    A

*/

public class problem15 {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      char ch = 'A';
      for (int j = 5; j > i; j--) {
        System.out.print((char) ch);
        ch++;
      }
      System.out.println();
    }
  }
}
