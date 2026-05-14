1class Solution {
2    public boolean isGood(int[] nums) {
3         Arrays.sort(nums);
4
5        int n = nums.length;
6        for (int i = 0; i < n - 1; i++) {
7            if (nums[i] != i + 1) {
8                return false;
9            }
10        }
11        return nums[n - 1] == n - 1;
12    }
13}