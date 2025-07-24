public class Q2{
public static void main(String ars[]){
	int n=10;
	int arr[]=new int [n];
	int k=0;
	for(int i=2;i<n;i++){
		boolean ans= true;
		for(int j=2;j<i;j++){
			if(i%j==0){
				ans= false;
				break;
			}
		}
		if(ans==true)
			arr[k++]=i;
	}
	for(int i=0;i<k;i++){
	System.out.print(arr[i]+" ");
	}
}
}