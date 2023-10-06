// Amazon interview question solution: find the target element in the sorted indifinite array.

public class IndifiniteArray {
    public static void main(String[] args) {
        int[] arr = { 4, 6, 7, 8, 10, 13, 15, 16, 19, 20, 24, 56, 67, 89, 90 };
        int target = 20;

        System.out.println(ans(arr, target));

    }

    static int ans(int[] arr, int target) {

        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int newstart = end + 1; // to initialize the new start.
            end = end + (end - start + 1) * 2; // to double the size of the array from its previous size.
            start = newstart;

        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        int ans = -1;

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

        return ans;
    }
}