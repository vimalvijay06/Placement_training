import java.util.Arrays;

public class MaximumGap {

    public static int maximumGap(int[] nums) {
        if (nums.length < 2) return 0;
        
        Arrays.sort(nums);
        
        int maxGap = 0;
        
        for (int i = 1; i < nums.length; i++) {
            int gap = nums[i] - nums[i - 1];
            maxGap = Math.max(maxGap, gap);
        }
        
        return maxGap;
    }

    public static void main(String[] args) {
        int[] nums = {3, 6, 9, 1};
        
        int result = maximumGap(nums);
        
        System.out.println("Maximum gap is: " + result);
    }
}
