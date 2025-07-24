import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] weight = new int[10];

        System.out.println("Enter weights of 10 people:");
        for (int i = 0; i < 10; i++) {
            weight[i] = sc.nextInt();
        }

        for (int i = 0; i < 9; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < 10; j++) {
                if (weight[j] > weight[maxIdx]) {
                    maxIdx = j;
                }
            }
            int temp = weight[i];
            weight[i] = weight[maxIdx];
            weight[maxIdx] = temp;
        }

        System.out.println("Sorted weights (descending):");
        for (int w : weight) {
            System.out.print(w + " ");
        }
    }
}
