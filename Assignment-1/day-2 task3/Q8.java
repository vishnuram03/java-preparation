import java.util.Scanner;
public class Q8{
public static void main(String ars[]){
Scanner sd = new Scanner(System.in);
String s = sd.next();
int count =0;
int n= s.length();
for(int i=0;i<s.length();i++){
if(s.charAt(i)>='A'  && s.charAt(i)<='Z')
count++;
}
if(count == n || count==0|| count==1 && s.charAt(0)>='A' && s.charAt(0)<='Z'){
System.out.print("true");
}
else{
System.out.print("false");
}
}
}