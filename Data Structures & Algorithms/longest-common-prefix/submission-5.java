class Solution {
    public String longestCommonPrefix(String[] strs) {
        String first = strs[0];
        int prefix = first.length();

        for (int i = 1; i < strs.length; i++){
            while (prefix > strs[i].length() || !first.substring(0, prefix).equals(strs[i].substring(0, prefix))){
                prefix--;
            }
        }
        return first.substring(0, prefix);
    }
}