import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[10];
        int below18 = 0, between18to60 = 0, above60 = 0;

        System.out.println("Enter age of 10 people:");
        for (int i = 0; i < 10; i++) {
            age[i] = sc.nextInt();
            if (age[i] < 18)
                below18++;
            else if (age[i] <= 60)
                between18to60++;
            else
                above60++;
        }

        System.out.println("Below 18: " + below18);
        System.out.println("Between 18 and 60: " + between18to60);
        System.out.println("Above 60: " + above60);
    }
}
