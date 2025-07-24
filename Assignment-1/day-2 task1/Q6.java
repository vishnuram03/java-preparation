public class Q6{
public static void main(String ars[]){
	int n = 10;
int[] arr = new int[32]; // large enough
int k = 0;
int temp = n;

while (temp > 0) {
    arr[k++] = temp % 2;
    temp = temp / 2;
}

for (int i = k - 1; i >= 0; i--) {
    System.out.print(arr[i]);
}

}
}