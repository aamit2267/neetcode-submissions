class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int c = 0;
        for(int num: nums){
            if (num == 1) {
                c++;
                if (c > max) max = c;
            }
            else {
                c = 0;
            }
        }
        return max;
    }
}