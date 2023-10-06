//leetcode solution: to find the target element in the mountain array.

public class FindMountain {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 7, 5, 4, 2 };
        int target = 5;
        System.out.println(search(arr, target));

    }

    static int search(int[] arr, int target) {
        int peak = peakElement(arr);
        int firstHalf = orderAgnostic(arr, target, 0, peak); // if target is in the first half.
        if (firstHalf != -1) {
            return firstHalf;
        }
        return orderAgnostic(arr, target, peak + 1, arr.length - 1); // if target is in the second half.
    }

    // to find where the peak element is.
    static int peakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    // to find what is the order of the array that we got from the peakElement.
    static int orderAgnostic(int[] arr, int target, int start, int end) {
        boolean ifAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (ifAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;

    }

}