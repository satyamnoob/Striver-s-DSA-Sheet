/*

    A
    AB
    ABC
    ABCD
    ABCDE

*/


public class pattern14 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            char ch = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print((char)ch);
                ch++;
            }
            System.out.println();
        }
    }
}
