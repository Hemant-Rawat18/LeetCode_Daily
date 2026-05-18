1class Solution {
2    public void nextPermutation(int[] nums) {
3        int i=nums.length-2;
4        while(i>=0 && nums[i]>=nums[i+1]){
5            i--;
6        }
7        if(i>=0){
8            int j=nums.length-1;
9            while(j>=0 && nums[j]<=nums[i])j--;
10            swap(nums,i,j);
11        }
12        reverse(nums,i+1);
13    }
14    public void swap(int[]nums,int i,int j){
15        int temp=nums[i];
16        nums[i]=nums[j];
17        nums[j]=temp;
18    }
19    public void reverse(int[]nums,int start){
20        int end=nums.length-1;
21        while(start<end){
22            swap(nums,start,end);
23            start++;
24            end--;
25        }
26    }
27}