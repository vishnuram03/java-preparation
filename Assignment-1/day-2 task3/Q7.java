import java.util.Scanner;
public class Q7{
	public static void main(String ars[]){
		Scanner sd = new Scanner(System.in);
		String s1= sd.nextLine();
		int count=0;
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i) ==' '){
				count++;
			}
		}
		if(s1.length()!=0){
			System.out.print(count+1);
		}
		else{
			System.out.print(count);
		}
	}
}
