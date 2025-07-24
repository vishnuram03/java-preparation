 class Employee {

    String emp_name;
    int emp_id;
    String designation;
    long salary;

    Employee() {
        System.out.println("Object has been created");  
        System.out.println(emp_name + " " + emp_id + " " + designation + " " + salary);
    }

    Employee(String emp_name, int emp_id, String designation, long salary) {
        this.emp_name = emp_name;
        this.emp_id = emp_id;
        this.designation = designation;
        this.salary = salary;
        System.out.println(emp_name + " " + emp_id + " " + designation + " " + salary);
    }

    Employee(Employee emp) {
        this.emp_name = emp.emp_name;
        this.emp_id = emp.emp_id;
        this.designation = emp.designation;
        this.salary = emp.salary;
        System.out.println(emp_name + " " + emp_id + " " + designation + " " + salary);
    }

    public static void main(String[] args) {
        Employee obj1 = new Employee();  
        Employee obj2 = new Employee("Vishnu Ram", 1644, "Developer", 446431L);  // parameterized
        Employee obj3 = new Employee(obj2); 
    }
}
