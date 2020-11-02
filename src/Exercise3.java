import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int integer = -1;
        while (integer < 1) {
            System.out.print("Enter an integer: ");
            integer = in.nextInt();
        }
        in.close();

        long sum = 0L;
        while (integer != 0) {
            int digit = integer % 10;
            integer = integer / 10;

            if (digit % 2 == 1) {
                sum = sum + digit;
            }
        }

        System.out.printf("\n%,d.\n", sum);
    }
}
