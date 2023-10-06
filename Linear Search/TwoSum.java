import java.util.Arrays;

// leetcode solution:

public class TwoSum {
    public static void main(String[] args) {

        int[] arr = { 1, 34, 54, 54, 10 };
        int target = 108;
        int[] ans = sums(arr, target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] sums(int[] arr, int target) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (i != j) {
                    sum = arr[i] + arr[j];
                }
                if (sum == target) {
                    return new int[] { i, j };
                }

            }

        }
        return new int[] { -1, -1 };
    }
}