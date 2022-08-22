/*

*
**
***
****
*****
****
***
**
*

*/

public class pattern10 {
    public static void main(String[] args) {
        int k = 2;
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j < ((i <= 5) ? i :  i - k); j++) {
                System.out.print("*");
            }
            k = (i >= 6) ? k + 2 : k;
            System.out.println();
        }
    }
}
