class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums.length;

        if (n == 0) {
            return 0;
        }

        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }

        int max = 1;
        for (int x : set) {
            if (!set.contains(x - 1)) {
                int current = x;
                int size = 1;
                while (set.contains(current)) {
                    if (size > max) {
                        max = size;
                    }
                    current++;
                    size++;
                }
            }
        }

        return max;
    }
}
