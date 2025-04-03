public class Solution {

    public long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] dp = new long[n + 1];

        for (int i = n - 1; i >= 0; i--) {
            int point = questions[i][0];
            int brainpower = questions[i][1];
            int nextIndex = i + brainpower + 1;

            //solve the current question
            long solve = point + (nextIndex < n ? dp[nextIndex] : 0);

            //skip to the current question
            long skip = dp[i + 1];

            //take the maximum of both choices
            dp[i] = Math.max(solve, skip);
        }
        return dp[0];
    }
}