class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        List<Integer>[] freq = new List[n + 1];
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();

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

        boolean shouldBreak = false;

        for (int i = freq.length - 1; i > 0; i--) {
            if (shouldBreak == true) {
                break;
            }
            for (int x : freq[i]) {
                if (res.size() >= k) {
                    shouldBreak = true;
                    break;
                }
                res.add(x);
            }
        }

        int finalRes[] = new int[k];

        for (int i = 0; i < res.size(); i++) {
            finalRes[i] = res.get(i);
        }

        return finalRes;
    }
}
