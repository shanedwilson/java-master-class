public class MethodOverloading {
    public static void main(String[] args) {
        double cm = calcFeetAndInchesToCentimeters(-10);
        System.out.println("Your answer is " + cm);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && (inches >= 0 && inches <=12)) {
            return (feet * 30.48) + (inches * 2.54);
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >=0) {
            double feet = (int) inches / 12;
            double leftover = (int) inches % 12;
            return (calcFeetAndInchesToCentimeters(feet, leftover));
        }
        return -1;
    }
}
