package 动态规划AA.买卖股票的最佳时机3;

class Solution {
    public int maxProfit(int[] prices) {
        int max_k = 2;
        int n = prices.length;
        int[][][] dp = new int[n][max_k + 1][2];
        //初始化值， 这里
        dp[0][0][1] = prices[0];
        dp[0][1][1] = prices[0];
        for (int i = 1; i < n; i++) {
            for (int k = max_k; k >= 1; k--) {
                if (i - 1 == -1) {
                    dp[i][k][0] = 0;
                    dp[i][k][1] = -prices[i];
                    continue;
                }
                dp[i][k][0] = Math.max(dp[i-1][k][0],dp[i-1][k][1] + prices[i]);
                dp[i][k][1] = Math.max(dp[i-1][k][1],dp[i-1][k-1][0] - prices[i]);
            }
        }
        // 穷举了 n × max_k × 2 个状态，正确。
        return dp[n - 1][max_k][0];
    }
}