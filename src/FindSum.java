public class FindSum {

    public int sumWithForLoop(int[] nums){
        int total = 0;

        for (int i = 0; i < nums.length; i++){
            total += nums[i];
        }
        return total;
    }

    public int sumWithWhileLoop(int[] nums){
        int total = 0;
        int i = 0;
        while (i < nums.length){
            total += nums[i];
            i++;
        }
        return total;
    }

    public int sumUsingRecursion(int[] nums) {
        return sumUsingRecursionHelper(nums, 0);
    }

    private int sumUsingRecursionHelper(int[] nums, int index) {
        // Base case
        if (index == nums.length) {
            return 0;
        }
        // Recursive case
        return nums[index] + sumUsingRecursionHelper(nums, index + 1);
    }
}
