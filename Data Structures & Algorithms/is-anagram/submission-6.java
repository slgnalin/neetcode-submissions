class Solution {
    public boolean isAnagram(String s, String t) {
        int m = s.length();
        int n = t.length();

        if (m != n) {
            return false;
        }

        Map<Character, Integer> sFreq = getFrequencyMap(s);
        Map<Character, Integer> tFreq = getFrequencyMap(t);

        if (sFreq.size() != tFreq.size()) {
            return false;
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
