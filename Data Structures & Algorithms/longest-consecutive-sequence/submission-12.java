class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length==0) return 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int num: nums){
            hs.add(num);
        }
        int l = 1;
        for (int num: hs){
            if(hs.contains(num-1)){
                continue;
            }
            else{
                int n = num;
                int c = 1;
                while(hs.contains(n+1)){
                    n++;
                    c++;
                }

                l = Math.max(l,c);
            }
        }
        return l;
    }
}
