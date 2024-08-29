public class Fibonacci {
    public static int[] getFibonacciNumbers(int count) {
        int[] fibonacciArray = new int[count];

        if (count <= 0)
            return fibonacciArray;

        // The first two Fibonacci numbers
        fibonacciArray[0] = 0; // First Fibonacci number
        if (count == 1)
            return fibonacciArray;

        fibonacciArray[1] = 1; // Second Fibonacci number

        // Compute the remaining Fibonacci numbers
        for (int i = 2; i < count; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }

        return fibonacciArray;
    }


}
