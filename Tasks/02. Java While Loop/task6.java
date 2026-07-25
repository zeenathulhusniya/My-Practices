class Main {
    public static void main(String[] args) {

        // declare variables
        int number = 12345;
        int count = 0;

        // count the digits
        while (number != 0) {
            number = number / 10;
            count++;
        }

        System.out.println("Number of digits = " + count);
    }
}