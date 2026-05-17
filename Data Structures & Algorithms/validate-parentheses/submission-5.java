class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        for (char c : s.toCharArray()) {
            System.out.printf("Looking at `%s`\n", c);
            if (!map.containsKey(c)) {
                stack.push(c);
            } else {
                if (!stack.isEmpty() && stack.peek() == map.get(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
            System.out.println(stack.toString());
        }

        return stack.isEmpty();
    }
}
