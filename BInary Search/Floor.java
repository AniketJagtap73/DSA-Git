//leetcode solution: To return the smallest greatest element in the array or the target element 

public class Floor {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 9, 12 };
        int target = 8;
        int ans = greatestSmallest(arr, target);
        System.out.println(ans);

    }

    static int greatestSmallest(int[] arr, int target) {
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

        return end; // when while loop breaks end  = mid-1 , next small number when no ans found
                    // points to the end .
    }

}
