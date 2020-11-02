import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int integer = -1;
        while (integer < 1 || integer > 92) {
            System.out.print("Enter an integer: ");
            integer = in.nextInt();
        }
        in.close();

        if (integer == 1) {
            System.out.println("\n0.");
        } else if (integer == 2) {
            System.out.println("\n1.");
        } else {
            long a = 0L;
            long b = 1L;
            long c = a + b;

            for (int i = 3; i < integer; i++) {
                a = b;
                b = c;
                c = a + b;
            }

            System.out.printf("\n%,d.\n", c);
        }
    }
}
