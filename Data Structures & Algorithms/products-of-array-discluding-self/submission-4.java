class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        Arrays.fill(answer, 1);
        int prefix = 1;
        int postfix = 1;

        for (int i=0; i<n; i++) {
           answer[i] = prefix;
           prefix = nums[i]*prefix;
        }

        for (int i=n-1; i>=0; i--) {
           answer[i] = postfix * answer[i];
           postfix = postfix*nums[i];
        }

        return answer;
    }
}  
