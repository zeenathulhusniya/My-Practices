import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // create Scanner object
        Scanner input = new Scanner(System.in);

        int choice = 0;

        // continue until user chooses Exit
        while (choice != 5) {

            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice >= 1 && choice <= 4) {

                System.out.print("Enter first number: ");
                int a = input.nextInt();

                System.out.print("Enter second number: ");
                int b = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Result = " + (a + b));
                        break;

                    case 2:
                        System.out.println("Result = " + (a - b));
                        break;

                    case 3:
                        System.out.println("Result = " + (a * b));
                        break;

                    case 4:
                        System.out.println("Result = " + (a / b));
                        break;
                }

            } else if (choice == 5) {
                System.out.println("Calculator closed.");

            } else {
                System.out.println("Invalid choice.");
            }
        }

        input.close();
    }
}