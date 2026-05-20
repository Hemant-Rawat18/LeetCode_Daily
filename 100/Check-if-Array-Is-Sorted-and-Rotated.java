1class Solution {
2    public boolean check(int[] nums) {
3        int count=0;
4       for(int i=0;i<nums.length-1;i++){
5        if(nums[i]>nums[i+1]){
6            count++;
7        }
8       }
9        if(nums[nums.length - 1] > nums[0]) {
10            count++;
11        }
12        return count<=1;
13    }
14
15}