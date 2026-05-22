class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;

        int l = 0;
        int r = n - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            int curr = nums[mid];

            if (curr == target) {
                return mid;
            } else if (curr > target) {
                r = mid - 1;
            } else if (curr < target) {
                l = mid + 1;
            }
        }

        return -1;
    }
}
