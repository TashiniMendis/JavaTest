import java.util.Arrays;
import java.util.List;
public class LargestPossibleNumber {
    public static String formLargestNumber(int[] numbers) {
        //convert integer array to String array
        String[] strNumbers = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        //Sort the String array
        Arrays.sort(strNumbers, (a, b) -> (b + a).compareTo(a + b));

        //Check the Largest number is zero
        if (strNumbers[0].equals("0")) {
            return "0";
        }

        // Join sorted strings
        return String.join("", strNumbers);
    }
}
