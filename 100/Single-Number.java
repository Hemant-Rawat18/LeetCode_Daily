1class Solution {
2    public int singleNumber(int[] nums) {
3        HashMap<Integer,Integer>hm=new HashMap<>();
4        for(int i=0;i<nums.length;i++){
5            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
6        }
7        for(int i:hm.keySet()){
8            if(hm.get(i)==1){
9                return i;
10            }
11        }
12        return -1;
13    }
14}