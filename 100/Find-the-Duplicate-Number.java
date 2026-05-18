1class Solution {
2    public int findDuplicate(int[] nums) {
3        Arrays.sort(nums);
4        for(int i=0;i<nums.length-1;i++){
5            if(nums[i]==nums[i+1]){
6                return nums[i];
7            }
8        }
9        return -1;
10    }
11}