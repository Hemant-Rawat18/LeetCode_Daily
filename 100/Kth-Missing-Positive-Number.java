1class Solution {
2    public int findKthPositive(int[] arr, int k) {
3        int b = 0;
4        int j = 0;
5
6        for (int i = 1; ; i++) {
7            if (j < arr.length && arr[j] == i) {
8                j++;
9            } else {
10                b++;
11                if (b == k) {
12                    return i;
13                }
14            }
15        }
16    }
17
18}