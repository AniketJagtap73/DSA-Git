// leetcode solution : To find the peak elment int the bitonic(mountain array) array.

public class Mountain {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 4, 5, 7, 6, 5, 4, 3, 2, 1 };

        System.out.println(peakInMountain(arr));

    }

    static int peakInMountain(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid; // here we don't know for sure if the mid element is the correct answer could be
                           // equal or less than mid.
            } else {
                start = mid + 1; // here we know mid is smaller than mid +1 element.

            }
        }
        return start; // in the end the start and end will point to the same element.
    }

}
