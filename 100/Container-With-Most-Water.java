1class Solution {
2    public int maxArea(int[] nums) {
3        // int min=0;
4        //  int max=0;
5        // for(int i=0;i<height.length;i++){
6        //     for(int j=i+1;j<height.length;j++){
7        //         int area=0;
8        //         min=Math.min(height[i],height[j]);
9        //         area=min*(j-i);
10        //         max=Math.max(area,max);
11
12        //     }
13        // }
14        // return max;
15     
16        int min=0;
17        int max=0;
18        int l=0;
19        int r=nums.length-1;
20        while(l<r){
21            min=Math.min(nums[l],nums[r]);
22            int area=min*(r-l);
23            max=Math.max(area,max);
24            if(nums[l]<nums[r]){
25                l++;
26            }else{
27                r--;
28            }
29        }
30        return max;
31
32
33        
34    }
35}