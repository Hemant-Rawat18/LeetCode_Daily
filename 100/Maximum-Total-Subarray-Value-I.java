1class Solution {
2    public long maxTotalValue(int[] nums, int k) {
3
4        Arrays.sort(nums);
5    long m=nums[0];
6    long n=nums[nums.length-1];
7    long val=Math.abs(m-n);
8    return val*k;
9        
10    }
11}