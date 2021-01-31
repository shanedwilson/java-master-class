import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i=1; i<=10; i++ ) {
            System.out.println("Please enter number " + i + ":");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
            } else {
                System.out.println("Invalid number.");
                i--;
            }
            scanner.nextLine();
        }
        System.out.println("The sum of your numbers is: " + sum);
        scanner.close();
    }
}
