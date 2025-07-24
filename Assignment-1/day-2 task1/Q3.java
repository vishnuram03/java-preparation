public class Q3{
public static void main(String ars[]){
int n=5;
for(int i=1,count =1;i<=n;i++){
	if(i<=(n/2 +1)){
		for(int j=1;j<=i;j++){
System.out.print(count);
count++;
}
for(int j=1;j<=i;j++){
System.out.print("w");
}
System.out.println();
	}
	else{
for(int j=0;j<=n-i;j++){
System.out.print(count);
count++;
}
for(int j=0;j<=n-i;j++){
System.out.print("w");
}
System.out.println();
	}

}
}
}
