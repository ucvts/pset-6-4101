import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int integer = -1;
        String output = "";

        while (integer < 1) {
            System.out.print("Enter an integer: ");
            integer = in.nextInt();
        }
        in.close();

        while (integer != 0) {
            int digit = integer % 10;
            integer = integer / 10;

            output = output + digit + (integer != 0 ? ", " : "");
        }

        System.out.println("\n" + output + ".");
    }
}
