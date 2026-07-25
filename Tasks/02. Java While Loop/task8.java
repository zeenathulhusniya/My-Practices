class Main {
    public static void main(String[] args) {

        // declare variables
        int number = 121;
        int originalNumber = number;
        int reverse = 0;

        // reverse the number
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        // check palindrome
        if (originalNumber == reverse) {
            System.out.println(originalNumber + " is a Palindrome");
        } else {
            System.out.println(originalNumber + " is not a Palindrome");
        }
    }
}