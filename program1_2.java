public class program1_2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            for (int j = 1; j <= 1000; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count ==1 || count == 2) System.out.print(i + " ");
            count = 0;
        }
    }
}
