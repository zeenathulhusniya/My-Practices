class Main {
    public static void main(String[] args) {

        // upper half of diamond
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // lower half of diamond
        for (int i = 4; i >= 1; i--) {

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}