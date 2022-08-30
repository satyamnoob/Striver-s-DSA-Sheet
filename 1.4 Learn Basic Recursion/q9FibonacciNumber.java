import java.util.Scanner;

public class q9FibonacciNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    arr[0] = 0;
    arr[1] = 1;
    fibonacci(n, arr, 0, 1, 2);
    printArray(arr);
    sc.close();
  }

  private static void fibonacci(int n, int[] arr, int a, int b, int i) {
    if (i == n) return;
    arr[i] = a + b;
    fibonacci(n, arr, b, a + b, i + 1);
  }

  private static void printArray(int[] arr) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}
