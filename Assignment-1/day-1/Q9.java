public class Q9{
		int empid;
		String name;
		String department;
		int salary;
		Q9(int empid,String name,String department,int salary){
			this.empid = empid;
			this.name = name;
			this.department = department;
			this.salary = salary;
		}
		void display(){
		System.out.println(empid +","+ name +","+ department +","+ salary);
		}
		public static void main(String ars[]){
			Q9 obj = new Q9(1546,"vishnu ram","software developer",65586);
			obj.display();
		}
}
