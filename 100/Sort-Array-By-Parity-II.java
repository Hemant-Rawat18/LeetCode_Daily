1class Solution {
2    public int[] sortArrayByParityII(int[] nums) {
3        int arr[]=new int[nums.length];
4        int k=0;
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]%2==0){
7                arr[k]=nums[i];
8                k=k+2;
9            }
10
11        }
12        k=1;
13        for(int i=0;i<nums.length;i++){
14            if(nums[i]%2==1){
15                arr[k]=nums[i];
16                k=k+2;
17            }
18        }
19        return arr;
20    }
21}