class Main {
    public static void main(String[] args) {

        // declare variables
        int n = 10;
        int number = 1;
        int sum = 0;

        // find the sum of even numbers
        while (number <= n) {

            if (number % 2 == 0) {
                sum = sum + number;
            }

            number++;
        }

        System.out.println("Sum of even numbers = " + sum);
    }
}