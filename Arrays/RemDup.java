// leetcode solution : remove the duplicate values from the sorted array and return
//the size of the array(without non-duplicate values).

public class RemDup {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,5};
        System.out.println(removeDuplicates(arr));
    }

    static int removeDuplicates(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                continue;
            }
            arr[count] = arr[i];
            count++;
        }
        return count;
    }

}
