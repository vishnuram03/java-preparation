public class Q1{
public static void main(String ars[]){
int arr[]=new int[10];
for(int i=1;i<=10;i++){
arr[i-1]=i;
}
for(int i=0;i<10;i++){
if(arr[i]%2!=0)
System.out.print(arr[i]+" ");
}
}
}