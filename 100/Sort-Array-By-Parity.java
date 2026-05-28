1class Solution {
2    public int[] sortArrayByParity(int[] nums) {
3        int arr[]=new int[nums.length];
4        int k=0;
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]%2==0){
7                arr[k++]=nums[i];
8            }
9        }
10        for(int i=0;i<nums.length;i++){
11            if(nums[i]%2==1){
12                arr[k++]=nums[i];
13            }
14        }
15        return arr;
16        
17    }
18}