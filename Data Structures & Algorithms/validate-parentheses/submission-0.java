class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> stack = new Stack<>();
        for(Character c: s.toCharArray()){
            if(!map.containsKey(c)) {
                stack.push(c);
            }
            else {
                if (stack.empty()){
                    return false;
                }
                char top = stack.pop();
                if (top != map.get(c)){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
