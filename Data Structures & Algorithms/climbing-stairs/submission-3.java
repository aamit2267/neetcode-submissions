public class Solution {
    public int climbStairs(int n) {
        int oneStepBefore = 2;
        int twoStepsBefore = 1;

        for (int i = 3; i <= n; i++) {

            int current = oneStepBefore + twoStepsBefore;

            twoStepsBefore = oneStepBefore;
            oneStepBefore = current;
        }

        return n==1? 1: oneStepBefore;
    }
}