class Solution {
    public int minDifficulty(int[] job, int d) {
        int n = job.length;
        if (n < d) return -1;

        int[][] dp = new int[d + 1][n + 1];
        for (int[] row : dp)
            Arrays.fill(row, Integer.MAX_VALUE);

        dp[0][0] = 0;
        for (int day = 1; day <= d; day++) {
            for (int i = day; i <= n; i++) {
                int max = 0;
                for (int j = i; j >= day; j--) {
                    max = Math.max(max, job[j - 1]);
                    if (dp[day - 1][j - 1] != Integer.MAX_VALUE) {
                        dp[day][i] = Math.min(dp[day][i],
                            dp[day - 1][j - 1] + max);
                    }
                }
            }
        }
        return dp[d][n];
    }
}