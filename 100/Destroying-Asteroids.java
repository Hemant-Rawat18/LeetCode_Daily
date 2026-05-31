1class Solution {
2    public boolean asteroidsDestroyed(int mass, int[] nums) {
3         Arrays.sort(nums);
4         long currMass=mass;
5        for(int i=0;i<nums.length;i++){
6            if(currMass<nums[i]){
7                return false;
8            }
9            currMass=currMass+nums[i];
10        }
11        return true;
12    }
13}