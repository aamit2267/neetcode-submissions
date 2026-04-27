class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i=1; i<=numRows; i++){
            List<Integer> row = new ArrayList<>();
            int c = 1;
            for(int j=1; j<=i; j++){
                row.add(c);
                c = c * (i-j)/j;
            }
            triangle.add(row);
        }
        return triangle;
    }
}