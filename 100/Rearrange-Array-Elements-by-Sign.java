1class Solution {
2    public int[] rearrangeArray(int[] nums) {
3       int even[]=new int[nums.length/2];
4       int odd[]=new int[nums.length/2];
5       int k=0;
6       for(int i=0;i<nums.length;i++){
7        if(nums[i]>0){
8            even[k++]=nums[i];
9        }
10       }
11       int m=0;
12       for(int i=0;i<nums.length;i++){
13        if(nums[i]<0){
14            odd[m++]=nums[i];
15        }
16       }
17       int j=0;
18       int nums1[]=new int[nums.length];
19       for(int i=0;i<nums.length/2;i++){
20        nums1[j++]=even[i];
21        nums1[j++]=odd[i];
22       }
23       return nums1;
24    }
25}