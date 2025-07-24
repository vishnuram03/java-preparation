class Q4 {

    
    static void printPascal(int n) {
        for (int row = 1; row <= n; row++) {
          
            int c = 1; 
            for (int i = 1; i <= row; i++) {

                System.out.print(c + " ");
                c = c * (row - i) / i;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        printPascal(n);
    }
}