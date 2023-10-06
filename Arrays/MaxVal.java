public class MaxVal {
    public static void main(String[] args) {
        int[] arr = { 1, 34, 54, 31, 67 };
        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        int maxval = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxval) {
                maxval = arr[i];
            }

        }
        return (maxval);

    }

}
