// leetcode solution:facebook interview question.

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 7, 7, 8, 8, 9 };
        int target = 7;

        int[] sol = searchRange(nums, target);
        System.out.println(Arrays.toString(sol));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };
        // for start index of the target element.
        ans[0] = search(nums, target, true);
        // for end index of the target element.
        ans[1] = search(nums, target, false);

        return ans;
    }

    // this function will return the index value of the target.
    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                // condition to find the start and the end index of the target element.
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
        }
        return ans;
    }
}
