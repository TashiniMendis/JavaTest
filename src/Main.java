import java.util.*;
public class Main {
    public static void main(String[] args) {

        //Print Largest Possible Value
        int[] numbers = {50, 2, 1, 9};
        LargestPossibleNumber largestnumber = new LargestPossibleNumber();
        String largestNumber = largestnumber.formLargestNumber(numbers);
        System.out.println("The largest formed number is: " + largestNumber);

        //Print Fibonacci List
        Fibonacci fib = new Fibonacci();
        int[] fibonacciNumbers = fib.getFibonacciNumbers(100);
        System.out.println("100 Fibonacci numbers: ");
        for (int i=0; i<fibonacciNumbers.length; i++){
            System.out.print(fibonacciNumbers[i] + " ");
        }

        //List Combine
        List<Object> list1 = List.of("a", "b", "c");
        List<Object> list2 = List.of(1, 2, 3);

        ListCombiner listcombine = new ListCombiner();
        List<Object> combinedList = listcombine.combineLists(list1, list2);
        System.out.println("Combined List: " + combinedList);

        //Find Summation with loops
        int[] intArray = {1, 2, 3, 4, 5};

        FindSum sum = new FindSum();

        System.out.println("Sum using For-loop: " + sum.sumWithForLoop(intArray));
        System.out.println("Sum using While-loop: " + sum.sumWithWhileLoop(intArray));
        System.out.println("Sum using Recursion: " + sum.sumUsingRecursion(intArray));
    }
}
