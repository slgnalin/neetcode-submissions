class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int l = i + 1;
            int r = n - 1;

            int x = nums[i];
            if (x > 0) {
                break;
            }

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            while (l < r) {
                int y = nums[l];
                int z = nums[r];
                int sum = x + y + z;

                if (sum > 0) {
                    r--;
                } else if (sum < 0) {
                    l++;
                } else {
                    res.add(Arrays.asList(x, y, z));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                }
            }
        }

        return res;
    }
}
