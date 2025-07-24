import java.util.Scanner;

public class Q4 {
    static void print(int[] x, int n) {
        int single = 0, doubleDigit = 0;
        for (int i = 0; i < n; i++) {
            if (x[i] >= 0 && x[i] < 10)
                single += x[i];
            else if (x[i] >= 10 && x[i] < 100)
                doubleDigit += x[i];
        }
        System.out.println("Sum of single-digit elements: " + single);
        System.out.println("Sum of double-digit elements: " + doubleDigit);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter " + len + " elements:");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        print(arr, len);
    }
}
