class vehicle{
	int id;
	String name;
	int price;
	static int count=0;
	vehicle(int id,String name,int price){
		this.id = id;
		this.name=name;
		this.price = price;
		count++;
	}
	void display(){
		System.out.print(count);
	}
	
	public static void main(String ars[]){
		int count=0;
		vehicle v1 = new vehicle(1,"audi",2500000);
		vehicle v2 = new vehicle(2,"benz",3500000);
		v1.display();
	}
}