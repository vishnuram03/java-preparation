import java.util.Scanner;

public class Q10 {
    public static void inputMatrix(int[][] A, int m, int n, Scanner sc) {
        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                A[i][j] = sc.nextInt();
    }

    public static void displayMatrix(int[][] A, int m, int n) {
        System.out.println("Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(A[i][j] + " ");
            System.out.println();
        }
    }

    public static void sumMatrix(int[][] A, int m, int n) {
        int sum = 0;
        for (int[] row : A)
            for (int val : row)
                sum += val;
        System.out.println("Total sum: " + sum);
    }

    public static void rowWiseSum(int[][] A, int m, int n) {
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++)
                sum += A[i][j];
            System.out.println("Sum of row " + (i + 1) + ": " + sum);
        }
    }

    public static void columnWiseSum(int[][] A, int m, int n) {
        for (int j = 0; j < n; j++) {
            int sum = 0;
            for (int i = 0; i < m; i++)
                sum += A[i][j];
            System.out.println("Sum of column " + (j + 1) + ": " + sum);
        }
    }

    public static void transpose(int[][] A, int m, int n) {
        System.out.println("Transpose:");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++)
                System.out.print(A[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows (m): ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns (n): ");
        int n = sc.nextInt();

        int[][] A = new int[m][n];
        int choice;

        do {
            System.out.println("\n1. Input Matrix");
            System.out.println("2. Display Matrix");
            System.out.println("3. Sum of all elements");
            System.out.println("4. Row-wise sum");
            System.out.println("5. Column-wise sum");
            System.out.println("6. Transpose");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: inputMatrix(A, m, n, sc); break;
                case 2: displayMatrix(A, m, n); break;
                case 3: sumMatrix(A, m, n); break;
                case 4: rowWiseSum(A, m, n); break;
                case 5: columnWiseSum(A, m, n); break;
                case 6: transpose(A, m, n); break;
                case 7: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 7);
    }
}
