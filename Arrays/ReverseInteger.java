public class ReverseInteger {
    public static void main(String[] args) {
        int num = 2345;
        System.out.println(reverseInt(num));

    }

    static int reverseInt(int num) {

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        int total = 0;
        while (num != 0) {
            int digit = num % 10;
            total = total * 10 + digit;
            num /= 10;
        }
        if (total < min || total > max) {
            return 0;
        }
        return total;
    }

}
