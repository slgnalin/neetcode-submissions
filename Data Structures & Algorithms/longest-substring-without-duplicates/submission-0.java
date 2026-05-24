class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<String> set = new HashSet<>();
        int n = s.length();
        int max = 0;
        for (int i = 0; i < n; i++) {
            String sub = s.substring(i, n);
            Set<Character> test = new HashSet<>();
            for (int j = 0; j < sub.length(); j++) {
                if (test.contains(sub.charAt(j))) {
                    break;
                }
                test.add(sub.charAt(j));
            }
            max = Math.max(max, test.size());
        }

        return max;
    }
}
