//leetcode solution:

public class Wealth {
    public static void main(String[] args) {
        int[][] accounts = {
                { 12, 42, 6, 57, 64 },
                { 34, 53, 46, 67 },
                { 4, 5, 87, 86, 7 },
        };
        System.out.println(maximumWealth(accounts));
    }

    // person = row
    // account = col
    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }

}
