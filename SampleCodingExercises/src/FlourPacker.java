public class FlourPacker {
    public static void main(String[] args) {
        // big have 5K each. small have 1K each. goal is target of kilos
        System.out.println(canPack(2, 0, 9));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        bigCount *= 5;
        int bagSum = bigCount + smallCount;

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        if (bagSum >= goal) {
            if(smallCount >= goal %5) {
                return true;
            }
        }

        return false;
    }
}
