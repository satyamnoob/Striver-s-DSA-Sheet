/*
    E 
    E D 
    E D C 
    E D C B 
    E D C B A 
*/

public class problem18 {
  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      char ch = 'E';
      for (int j = 0; j < i; j++) {
        System.out.print((char)(ch - j) + " ");
      }
      System.out.println();
    }
  }
}
