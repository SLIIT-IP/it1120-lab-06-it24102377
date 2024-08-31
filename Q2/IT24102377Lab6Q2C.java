import java.util.Scanner;


public class IT24102377Lab6Q2C {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;

        for (int num = 0; num < 10; num++) {
            System.out.print("Enter number " + (num + 1) + ": ");
            numbers[num] = input.nextInt();
            sum += numbers[num];
        }

        double average = sum / 10.0;

        System.out.println("Sum of numbers: " + sum);
        System.out.println("Average of numbers: " + average);
     }
}