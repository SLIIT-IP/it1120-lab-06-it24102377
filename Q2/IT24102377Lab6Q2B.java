import java.util.Scanner;

public class IT24102377Lab6Q2B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int num = 0; num < 10; num++) {
            System.out.print("Enter number " + (num + 1) + ": ");
            numbers[num] = input.nextInt();

        }

        System.out.println("You entered:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}