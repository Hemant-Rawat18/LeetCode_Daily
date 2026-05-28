1class Solution {
2    public void moveZeroes(int[] nums) {
3        int [] result=new int[nums.length];
4        int p=0;
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]!=0){
7                nums[p]=nums[i];
8                p++;
9
10            }
11        }
12        while(p<nums.length){
13            nums[p]=0;
14            p++;
15        }
16        
17    }
18}