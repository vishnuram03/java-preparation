public class Q1{
	public static void main(String ars[]){
		String s1="1010";
		String s2="1011";
		String s3="";
		int i = s1.length()-1;
		int j= s2.length()-1;
		int carry=0;
		int sum=0;
		while(i>=0 || j>=0 || carry!=0){
			if(i >=0){
				sum += s1.charAt(i) -'0';
				i--;
			}	
			if(j>=0){
				sum+= s2.charAt(j)-'0';
				j--;
			}
			s3 += (sum + carry)%2;
			carry = sum/2;
			sum =0;
		}
		System.out.print(s3);
	}
}
				