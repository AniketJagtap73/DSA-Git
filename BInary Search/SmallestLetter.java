//leetcode solution:

public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr = { 'a', 'b', 'c', 'e', 'j' };
        char target = 'c';
        char ans = nextGreatestLetter(arr, target);
        System.out.println(ans);

    }

    static char nextGreatestLetter(char[] arr, char target) {

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // wraparound letters : for returning the 0th index if there is no biggest
        // letter present in the array.

        return arr[start % arr.length]; // to return the 0th index of the array.
    }

}
