public class Q5{
public static void main(String ars[]){
int n=22;
int []arr = new int [n];
for(int i=1;i<=n;i++){
arr[i-1]=i;
}
for(int i=0;i<n;i++){
	if(arr[i]%2==0){
	System.out.print(arr[i]+" ");
	}
}
}
}