import java.util.Scanner;
public class Q5{
public static void main(String ars[]){
Scanner sd = new Scanner(System.in);
String s = sd.next();
String t= sd.next();
sd.close();
int val=1;
for(int i=0;i<t.length();i++){
if(s.indexOf(t.charAt(i))==-1){
System.out.print("false");
val=0;
break;
}
}
if(val==1)
System.out.print("true");
}
}