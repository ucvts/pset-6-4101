import java.io.File;
import com.sun.management.OperatingSystemMXBean;

import java.lang.management.ManagementFactory;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a credit card number: ");
        long number = in.nextLong();
        in.close();

        int sumDigits = 0;
        int sumDigitsMult = 0;
        int digitCount = 0;
        int current = -1;
        int previous = -1;
        boolean multiply = false;

        while (number > 0) {
            int digit = (int) (number % 10);
            digitCount++;

            int temp = current;
            current = digit;
            previous = temp;

            if (multiply) {
                int product = digit * 2;
                int sum = 0;

                while (product > 0) {
                    temp = product % 10;
                    sum = sum + temp;
                    product = product / 10;
                }

                sumDigitsMult = sumDigitsMult + sum;
            } else {
                sumDigits = sumDigits + digit;
            }

            multiply = !multiply;
            number = number / 10;
        }

        if ((sumDigits + sumDigitsMult) % 10 == 0) {
            boolean valid = true;

            switch (current) {
                case 3:
                    if (previous != 4 && previous != 7) {
                        valid = false;
                    } else if (digitCount != 15) {
                        valid = false;
                    }
                    System.out.println(valid ? "\nAmerican Express." : "\nInvalid.");
                    break;
                case 4:
                    if (digitCount != 13 && digitCount != 16) {
                        valid = false;
                    }
                    System.out.println(valid ? "\nVisa." : "\nInvalid.");
                    break;
                case 5:
                    if (previous <= 0 || previous >= 6) {
                        valid = false;
                    } else if (digitCount != 16) {
                        valid = false;
                    }
                    System.out.println(valid ? "\nMastercard." : "\nInvalid.");
                    break;
                default: System.out.println("\nInvalid."); break;
            }
        } else {
            System.out.println("\nInvalid.");
        }
    }
}
