import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int integer = -1;
        while (integer < 1) {
            System.out.print("Enter an integer: ");
            integer = in.nextInt();
        }
        in.close();

        if (integer == 1) {
            System.out.println("\nNot prime.");
        } else if (integer == 2 || integer == 3) {
            System.out.println("\nPrime.");
        } else if (integer % 2 == 0) {
            System.out.println("\nNot prime.");
        } else {
            boolean prime = true;

            for (int i = 5; i <= Math.sqrt(integer); i = i + 2) {
                if (integer % i == 0) {
                    prime = false;
                    break;
                }
            }

            System.out.println(prime ? "\nPrime." : "\nNot prime.");
        }
    }
}
