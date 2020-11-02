import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int integer = -1;
        String factors = "";

        while (integer < 1) {
            System.out.print("Enter an integer: ");
            integer = in.nextInt();
        }
        in.close();

        int increment = integer % 2 == 0 ? 1 : 2;
        for (int i = 1; i <= Math.sqrt(integer); i = i + increment) {
            if (integer % i == 0) {
                factors = factors.isEmpty() ? String.valueOf(i) : factors + ", " + i;

                if (i != (integer / i)) {
                    factors = factors + ", " + (integer / i);
                } else if (i == Math.sqrt(integer)) {
                    factors = factors + ", " + i;
                }
            }
        }

        System.out.println("\n" + factors + ".");
    }
}
