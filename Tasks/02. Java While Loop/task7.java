class Main {
    public static void main(String[] args) {

        // declare variables
        int number = 5;
        int factorial = 1;

        // calculate factorial
        while (number > 0) {
            factorial = factorial * number;
            number--;
        }

        System.out.println("Factorial = " + factorial);
    }
}