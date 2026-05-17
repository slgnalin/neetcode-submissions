class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] output = new int[n];

        int product;

        product = 1;
        left[0] = 1;
        right[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = product * nums[i - 1];
            product = left[i];
        }

        product = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = product * nums[i + 1];
            product = right[i];
        }

        for (int i = 0; i < n; i++) {
            output[i] = left[i] * right[i];
        }

        return output;
    }
}
