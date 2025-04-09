//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public long mostPoints(int[][] questions){
        int n = questions.length;
        long [] dp = new long[n + 1];

        for(int i = n - 1; i >= 0; i--){
            int point = questions[i][0];
            int brainpower = questions[i][1];
            int nextIndex = i + brainpower + 1;

            long solve = point + (nextIndex - i < n ? dp[nextIndex] : 0);

            long skip = dp[i + 1];

            dp[i] = Math.max(solve, skip);
        }
        return dp[0];
    }

    public static void main(String[] args) {
        Main solution = new Main();

        int[][] questions = {
                {3, 2},  // question 0: 3 points, skip 2
                {4, 3},  // question 1: 4 points, skip 3
                {4, 4},  // question 2: 4 points, skip 4
                {2, 5}   // question 3: 2 points, skip 5
        };

        long result = solution.mostPoints(questions);
        System.out.println("Maximum points: " + result);
    }
    }
