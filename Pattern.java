import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                if (j <= i) {
                    System.out.print(k - j);
                } else if (j > i) {
                    System.out.print(k - i);
                }

            }
            System.out.println();
        }


    }
}