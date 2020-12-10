public class PrimeNumbers {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 3; i < 15; i++) {
            boolean isPrime = isPrime(i);
            if (isPrime) {
                System.out.println("Prime number = " + i + "," + count);
                count++;
            }
            if (count == 3) {
                break;
            }
        }
    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
