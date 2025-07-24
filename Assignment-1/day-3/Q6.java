class Employee {
    String name;
    int yearOfJoining;
    String address;

    Employee(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Robert", 1994, "64C-WallsStreat");
        Employee emp2 = new Employee("Sam", 2000, "68D-WallsStreat");
        Employee emp3 = new Employee("John", 1999, "26B-WallsStreat");

        // Header
        System.out.println("Name YearOfJoining Address");

        // Data (without aligned spacing)
        System.out.println(emp1.name + " " + emp1.yearOfJoining + " " + emp1.address);
        System.out.println(emp2.name + " " + emp2.yearOfJoining + " " + emp2.address);
        System.out.println(emp3.name + " " + emp3.yearOfJoining + " " + emp3.address);
    }
}
