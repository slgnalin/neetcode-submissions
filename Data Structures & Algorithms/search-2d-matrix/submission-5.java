class Solution {
    private int target;

    public boolean searchMatrix(int[][] matrix, int target) {
        this.target = target;

        int m = matrix.length;
        int n = matrix[0].length;

        int total = m * n;

        int l = 0;
        int r = total - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            int row = mid / n;
            int col = mid % n;

            int curr = matrix[row][col];
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
