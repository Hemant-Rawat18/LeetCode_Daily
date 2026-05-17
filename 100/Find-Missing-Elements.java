1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3       List<Integer> l = new ArrayList<>();
4        Arrays.sort(nums);
5        for (int i = 0; i < nums.length - 1; i++) {
6
7            if (nums[i] + 1 == nums[i + 1]) {
8                continue;
9            } else {
10
11                for (int j = nums[i] + 1; j < nums[i + 1]; j++) {
12                    l.add(j);
13                }
14
15            }
16        }
17        return l;
18    }
19}