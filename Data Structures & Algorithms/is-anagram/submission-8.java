class Solution {
    public boolean isAnagram(String s, String t) {
        int m = s.length();
        int n = t.length();

        if (m != n) {
            return false;
        }

        HashMap<Character, Integer> sFreq = new HashMap<>();
        HashMap<Character, Integer> tFreq = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            sFreq.put(s.charAt(i), sFreq.getOrDefault(s.charAt(i), 0) + 1);
            tFreq.put(t.charAt(i), tFreq.getOrDefault(t.charAt(i), 0) + 1);
        }

        return sFreq.equals(tFreq);
    }

    private Map<Character, Integer> getFrequencyMap(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            Integer currentFreq = freq.get(c);
            if (currentFreq == null) {
                freq.put(c, 1);
            } else {
                freq.put(c, currentFreq + 1);
            }
        }

        return freq;
    }
}
