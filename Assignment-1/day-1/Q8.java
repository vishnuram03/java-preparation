public class Q8{
public static void main(String ars[]){
int n=6;
int position =0;
while((n&1)==0 && n!=0){
n= n>>1;
position++;
}
System.out.print(position);
}
}