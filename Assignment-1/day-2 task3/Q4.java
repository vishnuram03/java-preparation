import java.util.Scanner;
public class Q4{
public static void main(String ars[]){
String s;
String t;
Scanner sc = new Scanner(System.in);
s= sc.next();
t= sc.next();
sc.close();
for(int i=0;i<t.length();i++){
if(s.indexOf(t.charAt(i))==-1){
System.out.print(t.charAt(i));
}
}

}
}
