//leetcode solution:

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = { 1, 12, 2798, 23, 4, 6, 78 };
        System.out.println(numberOfDigits(nums));
    }

    // for no.of even digits of number present in the array:
    static int numberOfDigits(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    // for checking if the number contains even no.of digits or not:
    static boolean even(int num) {

        int numberOfDigits = digits(num);

        if (numberOfDigits % 2 == 0) {

            return true;
        }
        return false;

    }

    // for counting the no.of digits in the number:
    static int digits(int num) {

        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }

        int count = 0;

        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;

    }

}