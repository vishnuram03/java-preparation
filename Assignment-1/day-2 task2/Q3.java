public class Q3{
public static void main(String ars[]){
int n=30;
int first =0,second =1;
System.out.print(first +" ");
System.out.print(second+" ");
for(int i=3;i<=n;i++){
	int third = first + second;
	System.out.print(third +" ");
	first = second;
	second = third;
}
}
}