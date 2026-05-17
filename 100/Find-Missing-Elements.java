1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        List<Integer> l = new ArrayList<>();
4        Arrays.sort(nums);
5        for (int i = 0; i < nums.length - 1; i++) {
6            int curr = nums[i];
7            int next = nums[i + 1];
8            for (int j = curr + 1; j < next; j++) {
9                l.add(j);
10            }
11        }
12
13        return l;
14    }
15}