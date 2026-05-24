class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        Set<Integer> seen = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int curr = nums[i];
            if (seen.contains(curr)) {
                return curr;
            }
            seen.add(curr);
        }

        return -1;
    }
}
