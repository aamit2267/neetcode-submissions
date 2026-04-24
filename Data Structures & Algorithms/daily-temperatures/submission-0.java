class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Stack<Integer> temp = new Stack<>();

        for(int i=0; i<n; i++){
            while (!temp.isEmpty() && temperatures[i] > temperatures[temp.peek()]) {
                int index = temp.pop();
                result[index] = i - index;
            }
            temp.push(i);
        }

        return result;
    }
}
