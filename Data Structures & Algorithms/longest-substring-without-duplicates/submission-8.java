class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n <= 1) {
            return n;
        }

        Map<Character, Integer> map = new HashMap<>();

        int max = 0;

        int l = 0;
        for (int r = 0; r < n; r++) {
            Character curr = s.charAt(r);
            if (map.containsKey(s.charAt(r))) {
                l = Math.max(map.get(s.charAt(r)) + 1, l);
            }
            map.put(curr, r);
            max = Math.max(max, r - l + 1);
        }

        return max;
    }
}
