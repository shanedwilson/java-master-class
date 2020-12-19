public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(798);
    }

    public static void numberToWords(int number) {
        int digitCount = getDigitCount(number);
        int reverse = reverse(number);
        if (number < 0){
            System.out.println("Invalid Value");
        }

        while(digitCount > 0) {
            int lastDigit = reverse % 10;
            if(lastDigit == 0) {
                System.out.println("Zero");
            } else if (lastDigit == 1){
                System.out.println("One");
            } else if (lastDigit == 2){
                System.out.println("Two");
            } else if (lastDigit == 3){
                System.out.println("Three");
            } else if (lastDigit == 4){
                System.out.println("Four");
            } else if (lastDigit == 5){
                System.out.println("Five");
            } else if (lastDigit == 6){
                System.out.println("Six");
            } else if (lastDigit == 7){
                System.out.println("Seven");
            } else if (lastDigit == 8){
                System.out.println("Eight");
            } else if (lastDigit == 9){
                System.out.println("Nine");
            }
            digitCount--;
            reverse /=10;
            if(reverse ==0) {
                while(digitCount > 0) {
                    System.out.println("Zero");
                    digitCount--;
                }
            }
        }
    }

    public static int reverse(int number) {
        int temp = number;
        int reverse = 0;

        while(temp != 0) {
            int lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit;
            temp /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        int digitCount = 0;
        if(number < 0) {
            return -1;
        }
        if(number == 0) {
            return 1;
        }
        for(int i = number; i > 0; i /= 10) {
            digitCount++;
        }
        return digitCount;
    }
}
