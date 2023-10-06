
public class linear {
    public static void main(String[] args) {
        int[] nums = { 23, 6, 75, 43, 45, 35, 8, 6, -34, 54, -5 };
        int target = -5;
        int ans = linearSearch(nums, target);

        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;

        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;

            }

        }
        return -1;

    }
}
