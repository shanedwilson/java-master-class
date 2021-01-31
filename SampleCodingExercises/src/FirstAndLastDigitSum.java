public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(702));
    }

    public static int sumFirstAndLastDigit(int number) {
        int sum;
        int leastSignificant = number % 10;
        int mostSignificant = number;
        if (number < 0) {
            return -1;
        }
        while (mostSignificant >= 10) {
            mostSignificant /= 10;
        }
        sum = leastSignificant + mostSignificant;
        return sum;
    }
}
