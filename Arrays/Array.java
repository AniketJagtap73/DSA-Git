import java.util.Arrays;

// This is to find the index of the target element in 2D array.
public class Array {
    public static void main(String[] args) {

        int[][] arr = {
                { 12, 42, 6, 57, 64 },
                { 34, 53, 46, 67 },
                { 4, 5, 87, 86, 7 },
        };

        int target = 7;
        int[] ans = twoDimArray(arr, target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] twoDimArray(int[][] arr, int target) {

        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if (arr[r][c] == target) {
                    return new int[] { r, c };
                }

            }
        }
        return new int[] { -1, -1 };

    }

}
