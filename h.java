public class h {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == (n - 1) / 2 || j == n - 1) {
                    System.out.print("P");
                } else {
                    System.out.print("");

                }
            }
            System.out.println();
        }
    }
}
