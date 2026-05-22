class Solution {
    private int target;

    public boolean searchMatrix(int[][] matrix, int target) {
        this.target = target;

        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            if (binarySearch(matrix[i]) == true) {
                return true;
            }
        }

        return false;
    }

    private boolean binarySearch(int[] nums) {
        int n = nums.length;

        int l = 0;
        int r = n - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            int curr = nums[mid];

            if (curr == target) {
                return true;
            } else if (curr < target) {
                l = mid + 1;
            } else if (curr > target) {
                r = mid - 1;
            }
        }

        return false;
    }
}
