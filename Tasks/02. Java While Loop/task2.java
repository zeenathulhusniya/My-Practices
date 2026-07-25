class Main {
    public static void main(String[] args) {

        // declare variable
        int number = 1;

        // print odd numbers
        while (number <= 50) {

            if (number % 2 != 0) {
                System.out.println(number);
            }

            number++;
        }
    }
}