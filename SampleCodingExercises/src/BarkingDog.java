public class BarkingDog {
    public static void main(String[] args) {
        boolean wakeUp = shouldWakeUp(true, 5);

        System.out.println(wakeUp);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking && (hourOfDay < 0 || hourOfDay > 23)) {
            return false;
        } else if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        }
        return false;
    }
}
