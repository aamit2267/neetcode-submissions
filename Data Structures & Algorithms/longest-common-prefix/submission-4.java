class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        sb.append(strs[0]);
        int n = sb.length();
        for(String s: strs){
            if (s.isBlank()) return "";
            if (s.length() < n) {
                sb.delete(s.length(), sb.length());
                n = s.length();
            }
            for(int i = 0; i < n; i++){
                if (s.charAt(i) != sb.charAt(i)){
                    sb.delete(i, sb.length());
                    n = i;
                }
            }
        }
        return sb.toString();
    }
}