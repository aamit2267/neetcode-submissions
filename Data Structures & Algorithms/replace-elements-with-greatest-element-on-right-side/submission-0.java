class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int maxNum = -1;
        int[] ans = new int[n];
        for(int i=n-1; i>=0; i--){
            ans[i] = maxNum;
            maxNum = Math.max(maxNum, arr[i]);
        }
        return ans;
    }
}