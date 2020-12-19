public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(15, 25));
    }

    public static int getGreatestCommonDivisor(int a, int b) {
        int smallestInt = Math.min(a, b);

        if (smallestInt < 10) {
            return -1;
        }
        for(int i = smallestInt; i >= 2; i--)
        if (a % i == 0 && b % i == 0){
            return i;
        }
        return 1;
    }
}
