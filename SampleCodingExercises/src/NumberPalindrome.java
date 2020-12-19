public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(505));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int lastDigit;
        int num = number;
        while (number != 0) {
            lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }
        if (reverse == num) {
            return true;
        } else {
            return false;

        }
    }
}
