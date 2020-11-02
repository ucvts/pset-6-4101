import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int lower = 1;
        int upper = 0;

        while (lower > upper) {
            System.out.print("Lower bound: ");
            lower = in.nextInt();
            System.out.print("Upper bound: ");
            upper = in.nextInt();
        }
        in.close();

        long sum1 = 0L;
        for (int i = lower; i <= upper; i++) {
            if (i % 2 == 0) {
                sum1 = sum1 + i;
            }
        }

        System.out.printf("\n%,d.\n", sum1);
    }
}
