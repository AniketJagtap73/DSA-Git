
//leetcode solution: To return the greatest smallest element in the array or the target element 

public class Ceiling {
    public static void main(String[] args) {

        int[] arr = { 4, 6, 8, 9, 12, 14, 22 };
        int target = 10;
        int ans = smallestGreatest(arr, target);
        System.out.println(ans);

    }

    static int smallestGreatest(int[] arr, int target) {
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start; // when while loop breaks start = end + 1 , next big number when no ans found
                      // points to the start .

    }

}
