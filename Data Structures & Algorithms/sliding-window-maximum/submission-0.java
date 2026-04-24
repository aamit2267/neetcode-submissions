class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        int l = 0;
        for (int r = k; r <= nums.length; r++){
            if (l==0) result[l] = maximum(Arrays.copyOfRange(nums,l,r), k);
            else{
                if (nums[r-1] > result[l-1]) {
                    result[l] = nums[r-1];
                }
                else if (nums[l] == result[l-1]) {
                    result[l] = result[l-1];
                } else{
                    result[l] = maximum(Arrays.copyOfRange(nums,l,r), k);
                }
            }
            l++;
        }
        return result;
    }

    private int maximum(int[] arr, int k){
        int max = -10001;
        for(int i=0; i<k; i++){
            if(arr[i]>max) max = arr[i];
        }
        return max;
    }
}
