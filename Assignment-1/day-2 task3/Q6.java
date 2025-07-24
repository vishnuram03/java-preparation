import java.util.Scanner;
public class Q6{
	public static void main(String ars[]){
		Scanner sd = new Scanner (System.in);
		String s1= sd.next();
		String s2= sd.next();
		sd.close();
		int num1=0;
		int num2=0;
		for(int i=0;i<s1.length();i++){
			num1= num1*10 + (s1.charAt(i)-'0');
		}
		for(int i=0;i<s2.length();i++){
			num2= num2*10 + (s2.charAt(i)-'0');
		}
		int sum = num1+ num2;
		String s3="";
		while(true){
			int rem = sum%10;
			s3= String.valueOf(rem) + s3;
			sum/=10;
			if(sum==0)
				break;
		}
		System.out.print(s3);
	}
}
		