public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(77, 25));
    }

    public static boolean hasSharedDigit(int a, int b) {
        if (a < 10 || a > 99 || b < 10 || b > 99) {
            return false;
        }
        int bNum = b;
        while (a != 0) {
            while (b != 0) {
                if (a % 10 == b % 10) {
                    return true;
                }
                b /= 10;
            }
            a /= 10;
            b = bNum;
        }
        return false;
    }
}
