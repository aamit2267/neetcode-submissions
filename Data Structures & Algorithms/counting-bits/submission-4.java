class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(int i=1; i<=n; i++){
            int x = i % 2;
            arr[i] = arr[i/2] + (x);
        }
        return arr;
    }
}
