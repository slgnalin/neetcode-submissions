class Solution {
    public int rob(int[] nums) {
        int firstBefore = 0;
        int secondBefore = 0;

        for (int num : nums) {
            int temp = Math.max(num + firstBefore, secondBefore);
            firstBefore = secondBefore;
            secondBefore = temp;
        }

        return secondBefore;
    }
}
