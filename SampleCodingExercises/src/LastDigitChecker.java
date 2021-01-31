public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(15, 95, 20));
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (!isValid(a) || !isValid(b) || !isValid(c)) {
            return false;
        }
        a %= 10;
        b %= 10;
        c %= 10;

        if((a == b) || (a == c) || (b == c)) {
            return true;
        }
        return false;
    }

    public static boolean isValid(int a) {
        if (a < 10 || a > 1000) {
            return false;
        }
        return true;
    }
}
