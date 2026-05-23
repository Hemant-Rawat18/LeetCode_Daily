1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        for(int i=0;i<nums.length;i++){
4            if(nums[i]==target){
5                return i;
6            }
7            else if(target<nums[i]){
8                return i;
9            }
10        }
11        return nums.length;
12    }
13}