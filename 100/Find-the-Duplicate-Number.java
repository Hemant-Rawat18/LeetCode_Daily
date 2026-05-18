1class Solution {
2    public int findDuplicate(int[] nums) {
3//        for(int i=0;i<nums.length-1;i++){
4  //          for(int j=i+1;j<nums.length;j++){
5    //            if(nums[i]==nums[j]){
6//                    return nums[i];
7  //              }
8    //        }
9      //  }
10        //return -1;
11        Arrays.sort(nums);
12        for(int i=0;i<nums.length;i++){
13            if(nums[i]==nums[i+1]){
14                return nums[i];
15            }
16        }
17        return -1;
18    }
19}