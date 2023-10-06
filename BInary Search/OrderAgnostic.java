//leetcode solution : First to find if the array is sorted in ascending or descending order and then find the target element .

public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr = { 90, 89, 78, 67, 56, 45, 34, 23, 12 };
        int target = 67;
        int ans = agnosticSearch(arr, target);

        System.out.println(ans);

    }

    static int agnosticSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean ifAsc = arr[start] < arr[end];

        if (ifAsc) {
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
        } else {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }

        }
        return -1;
    }

}
