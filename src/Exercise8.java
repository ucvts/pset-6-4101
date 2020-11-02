import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int height = -1;
        while (height < 1 || height > 24) {
            System.out.print("Height: ");
            height = in.nextInt();
        }
        in.close();

        System.out.println();
        for (int row = 0; row < height; row++) {
            for (int spaces = height - row; spaces > 1; spaces--) {
                System.out.print(" ");
            }

            for (int blocks = 0; blocks < row + 2; blocks++) {
                System.out.print("#");
            }

            System.out.println();
        }
    }
}
