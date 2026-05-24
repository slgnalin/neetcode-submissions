class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n <= 1) {
            return n;
        }

        Set<Character> set = new HashSet<>();
        int max = 0;

        int l = 0;
        for (int r = 0; r < n; r++) {
            Character curr = s.charAt(r);
            while (set.contains(curr)) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(curr);
            max = Math.max(max, set.size());
        }

        return max;
    }
}
