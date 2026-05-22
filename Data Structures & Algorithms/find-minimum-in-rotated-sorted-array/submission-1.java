class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;

        int prev = nums[0];
        int min = nums[0];

        for (int i = 0; i < n; i++) {
            if (nums[i] < prev) {
                return nums[i];
            }
            prev = nums[i];
        }

        return min;
    }
}
