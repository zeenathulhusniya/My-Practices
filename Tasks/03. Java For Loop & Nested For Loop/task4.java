class Main {
    public static void main(String[] args) {

        // print right triangle star pattern
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}