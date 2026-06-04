1class Solution {
2    public int findLHS(int[] nums) {
3        Map<Integer, Integer> map = new HashMap<>();
4        for (int num : nums) {
5            map.put(num, map.getOrDefault(num, 0) + 1);
6        }
7        int maxLen = 0;
8        for (int key : map.keySet()) {
9            if (map.containsKey(key + 1)) {
10                maxLen = Math.max(maxLen,
11                        map.get(key) + map.get(key + 1));
12            }
13        }
14
15        return maxLen;
16
17        
18    }
19}