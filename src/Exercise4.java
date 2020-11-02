import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int integer = 0;
        int count = 0;
        long sum = 0L;

        while (integer >= 0) {
            System.out.print("Enter an integer: ");
            integer = in.nextInt();

            if (integer >= 0) {
                count++;
                sum = sum + integer;
            } else {
                break;
            }
        }
        in.close();

        if (count > 0) {
            double average = (double) sum / count;
            System.out.printf("\n%,.2f.\n", average);
        } else {
            System.out.println("\nError: division by zero.");
        }
    }
}
