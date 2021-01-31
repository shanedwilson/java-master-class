public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(5);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int x = 0; x < number; x++) {
                for(int y = 0; y < number; y++ )
                    if(x == 0 || y == 0 || x == y
                            || x == number -1 || y == number -1
                            || x + y == number - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                System.out.println();
            }
        }
    }
}
