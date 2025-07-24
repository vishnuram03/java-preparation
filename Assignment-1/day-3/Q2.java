
public class Q2{
	String name;
	int roll_no;
	long phone_no;
	String address;
	Q2(String name,int roll_no,long phone_no,String address){
		this.name= name;
		this.roll_no=roll_no;
		this.phone_no=phone_no;
		this.address = address;
		System.out.println("hi i am "+name+" "+roll_no+" "+phone_no+" "+address);
	}
	public static void main(String ars[]){
		Q2 sd1 = new Q2( "Sam",12,9949464645l,"686/7 khjgfhvgjg gggg");
		Q2 sd2 = new Q2("john",13,9342072185l,"646/78hhvhvh gvhv");
	}
}
		
		