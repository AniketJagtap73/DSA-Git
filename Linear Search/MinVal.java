public class MinVal {
    public static void main(String[] args) {
        int[] nums = { 23, 6, 75, 43, 45, 35, 8, 6, -34, 54, -5 };
        System.out.println(min(nums));

    }

    static int min(int[] nums) {
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < ans) {
                ans = nums[i];
            }
        }
        return ans;

    }

}
