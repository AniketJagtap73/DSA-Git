// leetcode question : This is a code for rotated sorted array for non-duplicate and duplicate elements.

public class RSA {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 7, 7, 0, 1, 2 };
        System.out.println(findPivotWithDuplicates(arr));

    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if (pivot == -1) {
            // just do normal binary search
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // if pivot is found, you have found 2 asc sorted arrays
        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1);

    }

    static int binarySearch(int[] arr, int target, int start, int end) {
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
        return -1;
    }

    // for array containing non-duplicate elements.
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= start) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    // for array containing duplicate elements.
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // if start, mid and end points to the same element.
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {

                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++; // to ignore duplicate elements.

                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted pivot lies to the right side of the array.
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}