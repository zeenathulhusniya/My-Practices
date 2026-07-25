class Main {
    public static void main(String[] args) {

        // declare variables
        int n = 10;
        int first = 0;
        int second = 1;
        int count = 1;

        // generate Fibonacci series
        while (count <= n) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;

            count++;
        }
    }
}