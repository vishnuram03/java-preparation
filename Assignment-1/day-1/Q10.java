public class Q10 {
	 int empId;
    String name;

    Q10(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }
    public static void main(String[] args) {
        Q10 obj = new Q10(101, "Vishnu");

        if (obj instanceof Q10) {
            System.out.println("obj is an instance of Q10 class");
        } else {
            System.out.println("obj is NOT an instance of Q10 class");
        }
    }
}
