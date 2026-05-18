1class Solution {
2    public int maxSubArray(int[] nums) {
3        int current=0;
4        int maxSum=Integer.MIN_VALUE;
5        for(int i=0;i<nums.length;i++){
6            current=Math.max(current+nums[i],nums[i]);
7            maxSum=Math.max(current,maxSum);
8        }
9        return maxSum;
10        
11    }
12}