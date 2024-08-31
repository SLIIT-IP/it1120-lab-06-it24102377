import java.util.Scanner;

public class IT24102377Lab6Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sumOfSquares = 0;
        int count = 0;

        while (true) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            if (number == -99) {
                break;
            }

            if (number < 0) {
                System.out.println("Please enter a positive number.");
                continue;
            }

            sumOfSquares += number * number;
            count++;
        }


        if (count > 0) {
            double rms = Math.sqrt((double) sumOfSquares / count);
            System.out.println("Root Mean Square: " + rms);
        } else {
            System.out.println("No positive numbers were entered.");
        }
    }
}