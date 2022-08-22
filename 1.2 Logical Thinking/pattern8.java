/*
    *********
     *******
      *****
       ***
        *
*/

public class pattern8 {

    public static void main(String[] args) {
      int k = 9;
      for (int i = 1; i <= 5; i++) {
        for (int j = 0; j < i - 1; j++) {
          System.out.print(" ");
        }
        for (int j = k; j >= 1; j--) {
          System.out.print("*");
        }
        for (int j = 0; j < i - 1; j++) {
            System.out.print(" ");
        }
        System.out.println();
        k -= 2;
      }
    }
  }
  