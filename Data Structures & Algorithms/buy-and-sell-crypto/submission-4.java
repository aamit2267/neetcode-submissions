class Solution {
    public int maxProfit(int[] prices) {
        int mpr = 101;
        int mpro = 0;

        for (int p: prices){
            if (p < mpr)
                {mpr = p;}
            else
                {mpro = Math.max(mpro, p - mpr);}
        }

        return mpro;
    }
}
