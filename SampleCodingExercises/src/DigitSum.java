public class DigitSum {
    public static void main(String[] args) {
        System.out.println("The sum of the digits is " + sumDigits(1111));
    }

    public static int sumDigits(int n) {
        int sum = 0;
        if (n < 10) {
            return -1;
        }
        // 125 -> 125/10 = 12  -> 12 * 10 = 120 -> 120 -5 = 5
        while (n > 0) {
            //extract least significant digit
            int digit = n % 10;
            sum += digit;

            //drop least significant digit
            n /= 10;
        }
        return sum;
    }
}
