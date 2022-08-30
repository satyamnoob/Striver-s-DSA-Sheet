import java.util.Arrays;
import java.util.Scanner;

public class q7ReverseArray {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    printArray(arr);
    int[] ans = new int[n];
    Arrays.fill(ans, 0);
    reverseArray(arr, ans, 0, n - 1, n);
    printArray(ans);
    sc.close();
  }

  private static void printArray(int[] arr) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  private static void reverseArray(int[] arr, int[] ans, int start, int end, int len) {
    if(start == len) return;
    ans[start] = arr[end];
    reverseArray(arr, ans, start + 1, end - 1, len);
  }
}
