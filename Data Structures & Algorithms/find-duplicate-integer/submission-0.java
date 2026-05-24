class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;

        Map<Integer, Integer> freq = new HashMap<>();
        int res = 0;
        for (int i = 0; i < n; i++) {
            int curr = nums[i];
            int currentFreq = freq.getOrDefault(curr, 0) + 1;
            freq.put(curr, currentFreq);
            if (currentFreq == 2) {
                return curr;
            }
        }

        return res;
    }
}
