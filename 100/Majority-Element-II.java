1class Solution {
2    public List<Integer> majorityElement(int[] nums) {
3        ArrayList<Integer> al = new ArrayList<>();
4        Arrays.sort(nums);
5
6        int n = nums.length;
7
8        if (n < 3) {
9            Set<Integer> s = new HashSet<>();
10
11            for (int i = 0; i < n; i++) {
12                s.add(nums[i]);
13            }
14
15            for (int i : s) {
16                al.add(i);
17            }
18
19        } else {
20
21            int count = 1;
22
23            for (int i = 1; i < nums.length; i++) {
24
25                if (nums[i] == nums[i - 1]) {
26                    count++;
27                } else {
28
29                    if (count > n / 3) {
30                        al.add(nums[i - 1]);
31                    }
32
33                    count = 1;
34                }
35            }
36            if (count > n / 3) {
37                al.add(nums[n - 1]);
38            }
39        }
40
41        return al;
42    }
43}