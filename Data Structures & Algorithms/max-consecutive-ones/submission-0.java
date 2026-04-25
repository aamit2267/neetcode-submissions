class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int c = 0;
        for(int num: nums){
            if (num == 1) {
                c++;
            }
            else {
                max = Math.max(max, c);
                c = 0;
            }
        }
        max = Math.max(max, c);
        return max;
    }
}