/*
    1 
    2 3 
    4 5 6 
    7 8 9 10 
    11 12 13 14 15
     
*/

public class pattern13 {
    public static void main(String[] args) {
        int j = 1;
        for (int i = 0; i < 5; i++) {
            for (int k  = 0; k <= i; k++) {
                System.out.print(j++ + " ");
            }
            System.out.println();
        }
    }
}
