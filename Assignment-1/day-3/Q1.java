import java.util.Scanner;
class Student{
String name;
int roll_no;
Student(String name,int roll_no){
this.name = name;
this.roll_no = roll_no;
}
void display(){
System.out.print("hello i am "+name +" my roll_no is "+roll_no);
}

public static void main(String ars[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your roll no:");
int roll_no = sc.nextInt();
sc.nextLine();
System.out.println("Enter your name no:");
String name = sc.nextLine();
Student sd = new Student(name,roll_no);
sd.display();
}
}