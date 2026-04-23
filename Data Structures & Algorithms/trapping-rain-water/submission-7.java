class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int t = 0;
        int lmax = 0;
        int rmax = 0;
        while (l < r){
            lmax = Math.max(lmax, height[l]);
            rmax = Math.max(rmax, height[r]);
            if(height[l] < height[r]){
                t = t + lmax - height[l];
                l++;
            }
            else {
                t = t + rmax - height[r];
                r--; 
            }
        }

        return t;
    }
}
