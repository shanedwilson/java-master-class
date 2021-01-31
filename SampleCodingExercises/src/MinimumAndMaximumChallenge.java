import java.util.Scanner;

public class MinimumAndMaximumChallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.println("Please enter a number: ");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
            } else {
                System.out.println("Invalid number.");
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Your min number is: " + min + " and your max number is: " + max);
        scanner.close();
    }
}
