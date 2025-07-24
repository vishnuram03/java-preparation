public class Q7 {
    public static void main(String[] args) {
        int percent = 76;
        char grade;

        if (percent >= 85 && percent <= 100) {
            grade = 'A';
        } else if (percent >= 70) {
            grade = 'B';
        } else if (percent >= 50) {
            grade = 'C';
        } else {
            grade = 'F'; // F = Fail
        }

        switch (grade) {
            case 'A':
                System.out.println("Grade A");
                break;
            case 'B':
                System.out.println("Grade B");
                break;
            case 'C':
                System.out.println("Grade C");
                break;
            default:
                System.out.println("Fail");
        }
    }
}
