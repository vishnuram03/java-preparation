public class Q2{
public static void main(String ars[]){
int num=701;
String s="";
while(num >0){
	num--;
	s = (char)('A' + num%26 ) + s;
	num=num/26;
}
System.out.print(s);
}
}
