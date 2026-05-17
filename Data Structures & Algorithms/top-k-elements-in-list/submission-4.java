class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        List<Integer>[] freq = new List[n + 1];
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[k];
        
        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        // build freq map
        for (int i = 0; i < n; i++) {
            int curr = nums[i];
            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }

        // build freq bucket from freq map
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            freq[value].add(key);
        }

        int kIndex = 0;

        for (int i = freq.length - 1; i > 0 && kIndex < k; i--) {
            for (int x : freq[i]) {
                res[kIndex++] = x;
                if (kIndex >= k) {
                    return res;
                }
            }
        }

        return res;
    }
}
